package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Persona;
import com.example.demo.model.Usuario;

public interface IUsuarioRepository extends JpaRepository<Usuario, Integer> {

}
