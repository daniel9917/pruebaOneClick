package com.credibanco.assesment.library.serviceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.credibanco.assesment.library.model.Autor;
import com.credibanco.assesment.library.repository.AutorRepository;
import com.credibanco.assesment.library.service.AutorService;

@Service
public class AutorServiceImpl implements AutorService{

	@Autowired
	AutorRepository autorRepository;
	
	@Override
	public Autor create(Autor autor) {
		// TODO Auto-generated method stub
		return autorRepository.save(autor);
	}

	@Override
	public Autor update(Autor autor) {
		// TODO Auto-generated method stub
		return autorRepository.save(autor);
	}

	@Override
	public void delete(Autor autor) {
		// TODO Auto-generated method stub
		autorRepository.delete(autor);
	}

	@Override
	public Autor findById(Long id) {
		// TODO Auto-generated method stub
		return autorRepository.findById(id).get();
	}

	@Override
	public Iterable<Autor> findAll() {
		// TODO Auto-generated method stub
		return autorRepository.findAll();
	}

}
