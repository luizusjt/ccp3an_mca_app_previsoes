package br.usjt.Previsao_Do_Tempo.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Previsao implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)	
	private Long id;
	
	private String dia;
	
	private Double minima, maxima, humidade;
	
	private String descricao;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public Double getMinima() {
		return minima;
	}

	public void setMinima(Double minima) {
		this.minima = minima;
	}

	public Double getMaxima() {
		return maxima;
	}

	public void setMaxima(Double maxima) {
		this.maxima = maxima;
	}

	public Double getHumidade() {
		return humidade;
	}

	public void setHumidade(Double humidade) {
		this.humidade = humidade;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}