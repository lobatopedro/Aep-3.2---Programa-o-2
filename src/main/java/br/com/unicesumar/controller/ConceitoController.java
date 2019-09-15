package br.com.unicesumar.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.unicesumar.entity.Conceito;
import br.com.unicesumar.repository.ConceitoRepository;

@RestController
@RequestMapping("/api/conceito")
public class ConceitoController {
	
	@Autowired
	private ConceitoRepository repoConceito;
	
	@GetMapping
	public List<Conceito> get() {
		return repoConceito.findAll();
	}
	@GetMapping("/{id}")
	public Conceito get(@PathVariable String id) {
		return repoConceito.findById(id).get();
	}
	@PostMapping
	public String post(@RequestBody Conceito novo) {
		repoConceito.save(novo);
		return novo.getId();
	}
	@PutMapping("/{id}")
	public void get(@PathVariable String id, @RequestBody Conceito conceito) {
		if (!id.equals(conceito.getId())) {
			throw new RuntimeException("Os IDs devem ser iguais!");
		}
		repoConceito.save(conceito);
	}
	@DeleteMapping("/{id}")
	public void delete(@PathVariable String id) {
		repoConceito.deleteById(id);
	}

}
