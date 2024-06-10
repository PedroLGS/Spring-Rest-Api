package br.com.plgs.springrestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.plgs.springrestapi.model.entity.Depto;

public interface DeptoRepository extends JpaRepository<Depto, Integer>{
	Depto fnNomeDepto(int cod);
}
