package com.helloword.objetivo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Objeto")
public class Objetivo {

	@GetMapping
	public String Objeto() {
		return "Usei as habilidades de persistencia e orientaçao "
				+ "ao detalhe para conseguir fazer o codigo";
	}
	
}