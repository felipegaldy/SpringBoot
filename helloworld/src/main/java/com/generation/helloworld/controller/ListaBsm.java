package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
@RequestMapping("/lista-bsm")
public class ListaBsm {
	@GetMapping
	public String listaBsm() {
		return "Mentalidades \n1 - Orientação ao futuro\n2 - Responsabilidade Pessoal"
				+ "\n3 - Mentalidade de Crescimento\n4 - Persistência"
				+ "\n\nHabilidades \n1 - Trabalho em equipe\n2 - Atenção aos detalhes"
				+ "\n3 - Proatividade\n4 - Comunicação";
	}
}
