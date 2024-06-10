package br.com.plgs.springrestapi.controller;

import org.springframework.http.ResponseEntity;

import br.com.plgs.springrestapi.model.dto.UsuarioDTO;

public interface IUsuarioController {
	
	public ResponseEntity<Integer> validaLogin(UsuarioDTO usuarioDTO);

}
