package br.usjt.previsaoDoTempo2.service;

//import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.usjt.previsaoDoTempo2.model.bean.Previsao;
import br.usjt.previsaoDoTempo2.model.repository.PrevisoesRepository;

@Service
public class PrevisaoService {
	
	@Autowired
	private PrevisoesRepository previsoesRepo;
	
	public void save(Previsao previsao){
		previsoesRepo.save(previsao);
	}
	
//	public List <Previsao> listarTodos(){
//		List <Previsao> previsoes = previsoesRepo.findAll();
//		return previsoes;
//	}
//	
//	public void listarTodos(){
//		List <Previsao> previsoes = previsoesRepo.findAll();
//	}
}
