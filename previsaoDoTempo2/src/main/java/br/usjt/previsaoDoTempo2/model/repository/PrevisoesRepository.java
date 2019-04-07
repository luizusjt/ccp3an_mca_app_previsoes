package br.usjt.previsaoDoTempo2.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.usjt.previsaoDoTempo2.model.bean.Previsao;

public interface PrevisoesRepository extends JpaRepository<Previsao, Long>{

}
