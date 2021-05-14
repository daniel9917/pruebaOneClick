package com.credibanco.assesment.library.mapper;

import com.credibanco.assesment.library.dto.EditorialDTO;
import com.credibanco.assesment.library.model.Editorial;

public class EditorialMapper {
	
	public static Editorial dtoToEntity(EditorialDTO editorial) {
		return new Editorial(editorial.getNombre(),
							 editorial.getDireccion(), 
							 editorial.getTelefono(), 
							 editorial.getCorreo(), 
							 editorial.getMax_libros());
	}
	
	public static EditorialDTO entityToDTO(Editorial editorial) {
		return new EditorialDTO(editorial.getNombre(),
				 editorial.getDireccion(), 
				 editorial.getTelefono(), 
				 editorial.getCorreo(), 
				 editorial.getMax_libros());
	}
}
