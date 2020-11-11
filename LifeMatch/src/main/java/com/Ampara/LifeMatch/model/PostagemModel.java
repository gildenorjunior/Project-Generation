package com.Ampara.LifeMatch.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.Ampara.LifeMatch.Enums.Identificacao;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.sun.istack.NotNull;


@Entity
@Table (name = "tb_postagem")
public class PostagemModel {
	
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id_postagem;
	
	@Column
	@NotNull
	@JsonFormat(pattern="yyyy-mm-dd")
	private Date data_conclusao;
	
	@Column
	@NotNull
	@JsonFormat(pattern="yyyy-mm-dd")
	private Date data_postagem;
	
	@Column
	@NotNull
	@Size (min = 10 ,max = 500)
	private String descricao;
	
	@Column
	@NotNull
	private Identificacao identificacao;
	
	@Column
	@NotNull
	private String imagens_postagem;
	
	
	
	public Long getId_postagem() {
		return id_postagem;
	}

	public void setId_postagem(Long id_postagem) {
		this.id_postagem = id_postagem;
	}

	public Date getData_conclusao() {
		return data_conclusao;
	}

	public void setData_conclusao(Date data_conclusao) {
		this.data_conclusao = data_conclusao;
	}

	public Date getData_postagem() {
		return data_postagem;
	}

	public void setData_postagem(Date data_postagem) {
		this.data_postagem = data_postagem;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	
	public String getImagens_postagem() {
		return imagens_postagem;
	}

	public void setImagens_postagem(String imagens_postagem) {
		this.imagens_postagem = imagens_postagem;
	}
	
	
	
}
