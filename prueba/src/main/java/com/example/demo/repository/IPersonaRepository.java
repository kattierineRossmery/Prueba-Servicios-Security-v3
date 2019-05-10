package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Persona;

public interface IPersonaRepository extends JpaRepository<Persona, Integer> {

}
