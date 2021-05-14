package com.credibanco.assesment.library.service;





import com.credibanco.assesment.library.model.Autor;

public interface AutorService {
	
	public Autor create (Autor autor);
	public Autor update (Autor autor);
	public void delete(Autor autor);
	public Autor findById(Long id);
	public Iterable<Autor> findAll();
	
	

}
