package com.Ampara.LifeMatch.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.UniqueElements;

import com.sun.istack.NotNull;

@Entity
@Table (name = "tb_usuario")
public class UsuarioModel {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id_usuario;
	
	@Column
	@NotNull
	@Size (min = 10,max = 50)
	private String nome_completo;
	
	@Column
	@NotNull
	@Size (min = 8,max = 15)
	@UniqueElements
	private String senha;
	
	@Column
	@NotNull
	private boolean categoria_usuario;
	
	@Column
	@NotNull
	@Size (min = 9,max = 50)
	private String email;

	@Column
	@NotNull
	private String imagem_usuario;

	public Long getId_usuario() {
		return id_usuario;
	}

	public void setId_usuario(Long id_usuario) {
		this.id_usuario = id_usuario;
	}

	public String getNome_completo() {
		return nome_completo;
	}

	public void setNome_completo(String nome_completo) {
		this.nome_completo = nome_completo;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}


	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getImagem_usuario() {
		return imagem_usuario;
	}

	public void setImagem_usuario(String imagem_usuario) {
		this.imagem_usuario = imagem_usuario;
	}
	
		
}
