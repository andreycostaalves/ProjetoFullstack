package com.projetofullstack.resoucers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="/categorias")
public class CategoriaResource {
	
	@RequestMapping(method=RequestMethod.GET) //indica o metodo a ser usado = get, Post, Delete e etc.
	public String Listar() {
		return "Reste está funcionando.";
	}
	

}
