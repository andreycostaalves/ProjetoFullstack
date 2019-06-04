package com.projetofullstack.resoucers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.projetofullstack.domain.Categoria;
import com.projetofullstack.services.CategoriaService;

@RestController
@RequestMapping(value ="/categorias")
public class CategoriaResource {
	
	@Autowired
	private CategoriaService service;
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET) //indica o metodo a ser usado = get, Post, Delete e etc.
	public ResponseEntity<?> find(@PathVariable Integer id) { //ResponseEntity = encapsula varias informações HTTP para serviço rest.
		Categoria obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
		
		
		
	}
	

}
