package br.com.unicesumar.entity;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "avaliacao")
public class Avaliacao {
	
	@Id
	private String id;
	
	private String nomeDisciplina;
	
	
	@ManyToMany(mappedBy = "avaliacoes")
	private Set<Conceito> conceitosAvaliacao = new HashSet<>(); 
	
	public Avaliacao() {
		this.id = UUID.randomUUID().toString();
	}
	
	public String getId() {
		return id;
	}
	public String getNome() {
		return nomeDisciplina;
	}
	@JsonIgnore
	public Set<Conceito> getConceitosAvaliacao() {
		return conceitosAvaliacao;
	}
	

}
