package com.helloword.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Hdois")
public class ObjetivoController {
	
	@GetMapping
	public String Hdois() {
		return "Nessa semana eu quero me dedicar ao maximo para aprender o conteudo de spring.";
	}
}