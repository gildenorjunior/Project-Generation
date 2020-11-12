package com.Ampara.LifeMatch.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.sun.istack.NotNull;

@Entity
@Table (name = "tb_tema")
public class TemaModel {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long idTema;
	
	
	@Column
    @NotNull
    private String categoriaAjuda ;

	
	@Column
	@NotNull
	@Size (min = 10 ,max = 500)
	private String decricao;

	@OneToMany (mappedBy = "tema", cascade = CascadeType.ALL)
	@JsonIgnoreProperties ("tema")
	private  List<PostagemModel> postagem;

	public Long getIdTema() {
		return idTema;
	}

	public void setIdTema(Long idTema) {
		this.idTema = idTema;
	}

	public String getCategoriaAjuda() {
		return categoriaAjuda;
	}

	public void setCategoriaAjuda(String categoriaAjuda) {
		this.categoriaAjuda = categoriaAjuda;
	}

	public String getDecricao() {
		return decricao;
	}

	public void setDecricao(String decricao) {
		this.decricao = decricao;
	}

	public List<PostagemModel> getPostagem() {
		return postagem;
	}

	public void setPostagem(List<PostagemModel> postagem) {
		this.postagem = postagem;
	}
	
	
	
}
