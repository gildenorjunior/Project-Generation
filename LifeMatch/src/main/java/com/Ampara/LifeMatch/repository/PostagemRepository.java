package com.Ampara.LifeMatch.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Ampara.LifeMatch.model.PostagemModel;

@Repository
public interface PostagemRepository extends JpaRepository<PostagemModel, Long >{

	//MÉTODO PARA SER USADO NO CONTROLLER ONDE BUSCA POSTAGEM POR TITULO
	Optional<PostagemModel> findByTituloContainingIgnoreCase(String titulo);
	
}
