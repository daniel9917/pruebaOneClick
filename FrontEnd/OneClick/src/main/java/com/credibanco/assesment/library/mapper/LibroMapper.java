package com.credibanco.assesment.library.mapper;

import com.credibanco.assesment.library.dto.LibroDTO;
import com.credibanco.assesment.library.model.Libro;

public class LibroMapper {
	
	public static Libro dtoToEntity (LibroDTO libro) {
		return new Libro(libro.getTitulo(),
						 libro.getAno(),
						 libro.getGenero(),
						 libro.getN_paginas(),
						 libro.getEditorial(), 
						 libro.getAutor());
	}
	
	public static LibroDTO entitytoDTO(Libro libro) {
		return new LibroDTO( libro.getTitulo(),
							 libro.getAno(),
							 libro.getGenero(),
							 libro.getN_paginas(),
							 libro.getEditorial().getId(), 
							 libro.getAutor().getId(),
							 libro.getEditorial(), 
							 libro.getAutor());
	}

}
