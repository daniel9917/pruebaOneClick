package com.credibanco.assesment.library.dto;


import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.credibanco.assesment.library.model.Autor;
import com.credibanco.assesment.library.model.Editorial;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class LibroDTO {

	
	@NotBlank
	private String titulo;
	
	//año
	private String ano;
	
	@NotBlank
	private String Genero;

	@NotNull
	private int n_paginas;
	
	private Long id_editorial;
			
	@NotNull
	private Long id_autor;

	/*
	 * These objects are null until they reach LibroController
	 * 
	 * */
	@JsonIgnore
	private Editorial editorial;
	
	@JsonIgnore
	private Autor autor;
	
	public LibroDTO() {
		
	}

	public LibroDTO(@NotBlank String titulo, String ano, 
					@NotBlank String genero, @NotNull int n_paginas,
					Long id_editorial, @NotNull Long id_autor,
					Editorial editorial, Autor autor) {
		
		this.titulo = titulo;
		this.ano = ano;
		Genero = genero;
		this.n_paginas = n_paginas;
		this.id_editorial = id_editorial;
		this.id_autor = id_autor;
		this.editorial = editorial;
		this.autor = autor;
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

	public Long getId_editorial() {
		return id_editorial;
	}

	public void setId_editorial(Long id_editorial) {
		this.id_editorial = id_editorial;
	}

	public Long getId_autor() {
		return id_autor;
	}

	public void setId_autor(Long id_autor) {
		this.id_autor = id_autor;
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
	
	
	


	
	

}
