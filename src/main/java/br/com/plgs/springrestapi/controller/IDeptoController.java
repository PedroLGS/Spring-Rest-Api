package br.com.plgs.springrestapi.controller;

import org.springframework.http.ResponseEntity;

import br.com.plgs.springrestapi.model.dto.DeptoDTO;

public interface IDeptoController {

	public ResponseEntity<String> nomeDepto(DeptoDTO deptoDTO);
	
}
