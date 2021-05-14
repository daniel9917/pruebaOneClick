package com.credibanco.assesment.library.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Transient;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
public class Libro {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)	
	private Long id;
	
	@Column(name = "titulo", nullable = false)
	@NotBlank
	private String titulo;
	
	//año
	@Column(name = "ano", nullable = true)	
	private String ano;
	
	@Column(name = "genero", nullable = false)
	@NotBlank
	private String Genero;

	@Column(name = "n_paginas", nullable = false)
	@NotNull
	private int n_paginas;
	
	@JsonIgnore
	@ManyToOne(fetch = FetchType.EAGER )
	@JoinColumn(name = "editorial_id", nullable = true)
	private Editorial editorial;
	
	@JsonIgnore	
	@ManyToOne(fetch =FetchType.EAGER)
	@JoinColumn(name = "autor_id", nullable = false)	
	private Autor autor;
	
	@Transient
	private Long editorial_id;
	
	@Transient
	private Long autor_id;
	
	public Libro() {		
		
	}
	
	

	public Long getEditorial_id() {
		return editorial_id;
	}



	public void setEditorial_id(Long editorial_id) {
		this.editorial_id = editorial_id;
	}



	public Long getAutor_id() {
		return autor_id;
	}



	public void setAutor_id(Long autor_id) {
		this.autor_id = autor_id;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAno() {
		return ano;
	}

	public void setAno(String ano) {
		this.ano = ano;
	}

	public String getGenero() {
		return Genero;
	}

	public void setGenero(String genero) {
		Genero = genero;
	}

	public int getN_paginas() {
		return n_paginas;
	}

	public void setN_paginas(int n_paginas) {
		this.n_paginas = n_paginas;
	}

	public Editorial getEditorial() {
		return editorial;
	}

	public void setEditorial(Editorial editorial) {
		this.editorial = editorial;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}	




	@Override
	public String toString() {
		return "Libro [id=" + id + ", titulo=" + titulo + ", ano=" + ano + ", Genero=" + Genero + ", n_paginas="
				+ n_paginas + ", editorial=" + editorial + ", autor=" + autor + "]";
	}

	public Libro(@NotBlank String titulo, String ano, @NotBlank String genero, @NotNull int n_paginas,
			Editorial editorial, @NotBlank Autor autor) {		
		this.titulo = titulo;
		this.ano = ano;
		Genero = genero;
		this.n_paginas = n_paginas;
		this.editorial = editorial;
		this.autor = autor;
		this.autor_id = autor.getId();
		this.editorial_id = editorial.getId();
	}
	
	
	
	
	
	
	

}
