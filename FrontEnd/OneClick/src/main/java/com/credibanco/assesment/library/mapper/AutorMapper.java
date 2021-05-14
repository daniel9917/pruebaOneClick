package com.credibanco.assesment.library.mapper;

import com.credibanco.assesment.library.dto.AutorDTO;
import com.credibanco.assesment.library.model.Autor;

public class AutorMapper {
	
	public static Autor dtoToEntity (AutorDTO autor) {

		return new Autor(autor.getNombre(), 
				   autor.getCiudad_procedencia(),
				   autor.getCorreo(),
				   autor.getFecha_nacimiento());
	}
	
	public static AutorDTO entityToDTO(Autor autor) {
		return new AutorDTO(autor.getNombre(), 
				   autor.getCiudad_procedencia(),
				   autor.getCorreo(),
				   autor.getFecha_nacimiento());
	}

}
