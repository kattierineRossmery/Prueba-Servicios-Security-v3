package com.example.demo.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Persona;
import com.example.demo.repository.IPersonaRepository;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;


@RestController
@RequestMapping("/personas")
@Api(value = "API REST Personas")
public class RestDemoController {
	
	@Autowired
	private IPersonaRepository repo;
	
	@ApiOperation(value = "Retorna lista de Personas")
	@GetMapping
	public List<Persona> listar(){
		return repo.findAll();	
		
	}
	@ApiOperation(value = "Registra nueva persona")
	@PostMapping
	public void insertar(@RequestBody Persona per){
		repo.save(per);	
		
	}
	
	@ApiOperation(value = "Actualiza Persona")
	@PutMapping
	public void modificar(@RequestBody Persona per){
		repo.save(per);	
		
	}
	@ApiOperation(value = "Elimina Persona")
	@DeleteMapping(value = "/{id}")
	public void eliminar(@PathVariable("id") Integer id){
		repo.deleteById(id);
		
	}
}
