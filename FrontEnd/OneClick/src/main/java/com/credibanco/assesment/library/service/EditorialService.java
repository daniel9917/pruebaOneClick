package com.credibanco.assesment.library.service;

import java.util.Optional;

import com.credibanco.assesment.library.model.Editorial;


public interface EditorialService {
	
	public Editorial create (Editorial editorial);
	public Editorial update (Editorial editorial);
	public void delete(Editorial editorial);
	public Editorial findById(Long id);
	public Iterable<Editorial> findAll();

}
