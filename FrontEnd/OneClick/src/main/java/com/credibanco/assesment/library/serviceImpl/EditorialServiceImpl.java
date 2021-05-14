package com.credibanco.assesment.library.serviceImpl;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.credibanco.assesment.library.model.Editorial;
import com.credibanco.assesment.library.repository.EditorialRepository;
import com.credibanco.assesment.library.service.EditorialService;

@Service
public class EditorialServiceImpl implements EditorialService{

	
	@Autowired
	EditorialRepository ediRepo;
	
	@Override
	public Editorial create(Editorial editorial) {
		// TODO Auto-generated method stub
		return ediRepo.save(editorial);
	}

	@Override
	public Editorial update(Editorial editorial) {
		// TODO Auto-generated method stub
		return ediRepo.save(editorial);
	}

	@Override
	public void delete(Editorial editorial) {
		// TODO Auto-generated method stub
		ediRepo.delete(editorial);
		
	}

	@Override
	public Editorial findById(Long id) {
		// TODO Auto-generated method stub
		return ediRepo.findById(id).get();
	}

	@Override
	public Iterable<Editorial> findAll() {
		// TODO Auto-generated method stub
		return ediRepo.findAll();
	}


}
