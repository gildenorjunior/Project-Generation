package com.Ampara.LifeMatch.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.Ampara.LifeMatch.Enums.CategoriaAjuda;
import com.sun.istack.NotNull;

@Entity
@Table (name = "tb_tema")
public class TemaModel {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id_tema;
	
	
	@Column(columnDefinition = "ENUM('Higiene', 'Alimenticia', 'Profissional')")
    @Enumerated(EnumType.STRING)
    private CategoriaAjuda categoriaAjuda ;

	
	@Column
	@NotNull
	@Size (min = 10 ,max = 500)
	private String decricao;


	public Long getId_tema() {
		return id_tema;
	}


	public void setId_tema(Long id_tema) {
		this.id_tema = id_tema;
	}


	public String getDecricao() {
		return decricao;
	}


	public void setDecricao(String decricao) {
		this.decricao = decricao;
	}
		
	
}
