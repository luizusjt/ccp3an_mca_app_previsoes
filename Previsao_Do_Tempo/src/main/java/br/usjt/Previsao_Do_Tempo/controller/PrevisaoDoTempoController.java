package br.usjt.Previsao_Do_Tempo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PrevisaoDoTempoController {
	
	@GetMapping ("/index")
	public String inicio() {
		return "index";
	}
	
}
