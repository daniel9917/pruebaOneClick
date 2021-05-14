package com.credibanco.assesment.library.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.credibanco.assesment.library.model.Libro;
import com.credibanco.assesment.library.repository.LibroRepository;
import com.credibanco.assesment.library.service.LibroService;

@Service
public class LibroServiceImpls implements LibroService{

	@Autowired
	LibroRepository libroRepository;
	
	@Override
	public Libro create(Libro libro) {
		// TODO Auto-generated method stub
		return libroRepository.save(libro);
	}

	@Override
	public Libro update(Libro libro) {
		// TODO Auto-generated method stub
		return libroRepository.save(libro);
	}

	@Override
	public void delete(Libro libro) {
		// TODO Auto-generated method stub
		libroRepository.delete(libro);
		
	}

	@Override
	public Libro findById(Long id) {
		// TODO Auto-generated method stub
		return libroRepository.findById(id).get();
	}

	@Override
	public Iterable<Libro> findAll() {
		// TODO Auto-generated method stub
		return libroRepository.findAll();
	}

	/*
	 * There's three different filters:
	 * 		author
	 * 		year of publication
	 * 		title
	 * */
	@Override
	public List<Libro> findByKeyWorkd(String KeyWord, String filter) {
		// TODO Auto-generated method stub
		return null;
	}

}
