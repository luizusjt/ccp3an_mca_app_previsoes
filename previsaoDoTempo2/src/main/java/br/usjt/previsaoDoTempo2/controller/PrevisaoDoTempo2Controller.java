package br.usjt.previsaoDoTempo2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PrevisaoDoTempo2Controller {
	
	@GetMapping ("/index")
	public String inicio() {
		return "index";
	}
}
