package com.example.SpringBoot.Cidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Cidades {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@JsonProperty("id")
	private Integer id;
	
	@JsonProperty("nmCidade")
	private String nmCidade;
	
	@JsonProperty("sgEstado")
	private String sgEstado;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNmCidade() {
		return nmCidade;
	}

	public void setNmCidade(String nmCidade) {
		this.nmCidade = nmCidade;
	}

	public String getSgEstado() {
		return sgEstado;
	}

	public void setSgEstado(String sgEstado) {
		this.sgEstado = sgEstado;
	}

}
