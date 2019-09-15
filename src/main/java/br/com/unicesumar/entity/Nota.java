package br.com.unicesumar.entity;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Nota {
	
	@Id
	private String id;
	private Double valorNota;
	
	@OneToOne(mappedBy = "nota")
	private Conceito conceito;
	
	public Nota() {
		this.id = UUID.randomUUID().toString();
	}
	
	public String getId() {
		return id;
	}
	
	public Double getValorNota() {
		return valorNota;
	}
	
	@JsonIgnore
	public Conceito getConceito() {
		return conceito;
	}
}
