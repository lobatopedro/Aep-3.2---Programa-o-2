package br.com.unicesumar.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.unicesumar.entity.Conceito;

@Repository
public interface ConceitoRepository extends JpaRepository<Conceito, String> {

}
