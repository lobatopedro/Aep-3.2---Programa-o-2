package br.com.unicesumar.entity;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "conceito")
public class Conceito {
	
	@Id
	private String id;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Nota nota;
	
	private Set<Aluno> alunos = new HashSet<>();
	
	private Set<Avaliacao> avaliacoes = new HashSet<>();
	
	public Conceito() {
		this.id = UUID.randomUUID().toString();
	}
	
	public String getId() {
		return id;
	}
	
	public Nota getNota() {
		return nota;
	}
	
	public Set<Aluno> getAlunos() {
		return alunos;
	}
	
	public Set<Avaliacao> getAvaliacoes() {
		return avaliacoes;
	}
	
	

}
