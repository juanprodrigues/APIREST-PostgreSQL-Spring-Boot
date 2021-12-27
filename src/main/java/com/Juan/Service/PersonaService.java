package com.Juan.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Juan.Entity.Persona;
import com.Juan.Repositorio.PersonaResporitory;



@Service
public class PersonaService {
	
	@Autowired
	private PersonaResporitory personaResporitory;
	
	
	public Persona create (Persona persona) {
		return personaResporitory.save(persona);
	}
	
	public List<Persona> getAllPersonas (){
		return personaResporitory.findAll();
	}
	
	public void delete (Long id) {
		personaResporitory.deleteById(id);
	}
	
	public Optional<Persona> findById (Long id) {
		return personaResporitory.findById(id);
	}
	

}