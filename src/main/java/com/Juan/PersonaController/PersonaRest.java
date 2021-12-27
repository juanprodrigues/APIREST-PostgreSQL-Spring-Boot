package com.Juan.PersonaController;

import java.net.URI;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Juan.Entity.Persona;
import com.Juan.Service.PersonaService;


@RestController
@RequestMapping ("/api/persona/")
public class PersonaRest {
	
	@Autowired
	private PersonaService personaService;
	
	@PostMapping
	private ResponseEntity<Persona> guardar (@RequestBody Persona persona){
		Persona temporal = personaService.create(persona);
		
		try {
			return ResponseEntity.created(new URI("/api/persona"+temporal.getId())).body(temporal);
			
		}catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
		}
	}
	
	
	@GetMapping
	private ResponseEntity<List<Persona>> listarTodasLasPersona (){
		return ResponseEntity.ok(personaService.getAllPersonas());
	}
	
	@DeleteMapping(value = "{id}")
	private ResponseEntity<Void> eliminarPersona (@PathVariable ("id") Long id){
		personaService.delete(id);
		return ResponseEntity.ok().build();
	}
	
	@GetMapping (value = "{id}")
	private ResponseEntity<Optional<Persona>> listarPersonasPorID (@PathVariable ("id") Long id){
		return ResponseEntity.ok(personaService.findById(id));
	}
	

}