package com.Juan.Repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Juan.Entity.Persona;

@Repository
public interface PersonaResporitory extends JpaRepository<Persona, Long>{

}