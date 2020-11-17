package com.Ampara.LifeMatch.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Ampara.LifeMatch.model.UsuarioModel;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long> {


	Optional<UsuarioModel> findByLoginUsuarioContainingIgnoreCase(String loginUsuario);
	public Optional<UsuarioModel> findByLoginUsuarioAndSenha(String loginUsuario, String senha);
	//public Optional<UsuarioModel> findByLoginUsuario(String loginUsuario);
}
