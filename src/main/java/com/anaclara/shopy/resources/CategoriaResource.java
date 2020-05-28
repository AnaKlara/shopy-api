package com.anaclara.shopy.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.anaclara.shopy.domain.Categoria;
import com.anaclara.shopy.services.CategoriaService;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {

	/*
	@GetMapping
	public String listar() {
		return "Rest está funcionando!";
	}
	*/
	@Autowired
	private CategoriaService service;

	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		Categoria obj = service.find(id);
		return ResponseEntity.ok().body(obj);
	}
}
