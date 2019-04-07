package br.usjt.previsaoDoTempo2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.usjt.previsaoDoTempo2.model.bean.Previsao;
import br.usjt.previsaoDoTempo2.model.repository.PrevisoesRepository;
import br.usjt.previsaoDoTempo2.service.PrevisaoService;

@Controller
public class PrevisaoController {
	
	@Autowired
	private PrevisoesRepository previsoesRepo;
	
	@Autowired
	private PrevisaoService previsoesService;
	
	@GetMapping ("/previsoes")
	public ModelAndView listarPrevisoes(){
		//passe o nome da página ao construtor
		ModelAndView mv = new ModelAndView("lista_temperaturas");
		
		//para modelar o formulário
		mv.addObject(new Previsao());
		
		//Busque a coleção com o repositório
		List <Previsao> previsoes = previsoesRepo.findAll();
		
		//adicione a coleção ao objeto ModelAndView
		mv.addObject("previsoes", previsoes);
		
		//devolva o ModelAndView
		return mv;
	}
	
	@PostMapping("/previsoes")
	public String salvar (Previsao previsao) {
		previsoesService.save(previsao);
		return "redirect:/previsoes";
	}
}