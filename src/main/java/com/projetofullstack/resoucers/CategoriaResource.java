package com.projetofullstack.resoucers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.projetofullstack.domain.Categoria;

@RestController
@RequestMapping(value ="/categorias")
public class CategoriaResource {
	
	@RequestMapping(method=RequestMethod.GET) //indica o metodo a ser usado = get, Post, Delete e etc.
	public List<Categoria> listar() {
		
		Categoria cat1 = new Categoria(1, "Informatica");
		Categoria cat2 = new Categoria(2, "Escritório");
		
		List<Categoria> lista = new ArrayList<>();
		lista.add(cat1);
		lista.add(cat2);
		
		return lista; 
		
	}
	

}
