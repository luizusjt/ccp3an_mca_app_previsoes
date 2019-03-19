package br.usjt.Previsao_Do_Tempo.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.Previsao_Do_Tempo.model.Previsao;

public interface PrevisoesRepository extends JpaRepository<Previsao, Long>{

}
