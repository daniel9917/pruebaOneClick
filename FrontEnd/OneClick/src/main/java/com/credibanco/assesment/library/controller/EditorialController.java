package com.credibanco.assesment.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.credibanco.assesment.library.dto.EditorialDTO;
import com.credibanco.assesment.library.mapper.EditorialMapper;
import com.credibanco.assesment.library.model.Editorial;
import com.credibanco.assesment.library.serviceImpl.EditorialServiceImpl;

@CrossOrigin
@RestController
@RequestMapping("/editorial")
public class EditorialController {
	
	@Autowired
	EditorialServiceImpl editorialServiceImpl;
	
	@GetMapping(path = "/find")
	public @ResponseBody Iterable<Editorial> listAll() {				
		return this.editorialServiceImpl.findAll();
	}
	
	@PostMapping(path = "/create")
	public @ResponseBody Editorial create(@RequestBody EditorialDTO editorialdto) {
		
		Editorial editorial = EditorialMapper.dtoToEntity(editorialdto);		
		return this.editorialServiceImpl.create(editorial);
	}

}
