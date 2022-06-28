package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/objetivos")


public class ObjetivosAprendizagem {
	@GetMapping
	public String objetivosAprendizagem() {
		return "Objetivos de Aprendizagem \n1 - Entender os protocolos HTTP GET, POST, PUT, DELETE"
				+ "\n2 - Usar o framework Spring com sabedoria\n3 - Fazer CRUD";
	}
}
