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
@Table(name ="aluno")
public class Aluno {
	
	@Id
	private String id;
	private String nome;
	
	@ManyToMany(mappedBy = "alunos")
	private Set<Conceito> conceito = new HashSet<>();
	
	public Aluno(String nome) {
		this.id = UUID.randomUUID().toString();
	}
	
	public String getId() {
		return id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@JsonIgnore
	public Set<Conceito> getConceito() {
		return conceito;
	}
	

}
