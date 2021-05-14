package com.credibanco.assesment.library.service;




import java.util.List;

import com.credibanco.assesment.library.model.Libro;

public interface LibroService {
	
	public Libro create (Libro libro);
	public Libro update (Libro libro);
	public void delete(Libro libro);
	public Libro findById(Long id);
	public Iterable<Libro> findAll();
	
	List<Libro> findByKeyWorkd(String KeyWord, String filter);
	
	

}
