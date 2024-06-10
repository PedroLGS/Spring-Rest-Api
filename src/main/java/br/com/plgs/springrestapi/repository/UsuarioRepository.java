package br.com.plgs.springrestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;

import br.com.plgs.springrestapi.model.entity.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer>{
	@Procedure(name = "Usuario.spValidaLogin")
	Integer spValidaLogin(@Param("login") String login, @Param("senha") String senha);
}
