package com.credibanco.assesment.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.credibanco.assesment.library.dto.AutorDTO;
import com.credibanco.assesment.library.mapper.AutorMapper;
import com.credibanco.assesment.library.model.Autor;
import com.credibanco.assesment.library.serviceImpl.AutorServiceImpl;

@CrossOrigin
@RestController
@RequestMapping("/autor")
public class AutorController {
	
	@Autowired
	AutorServiceImpl autorServiceImple;
	
	@GetMapping(path = "/find")
	public Iterable<Autor> listAll() {
		return autorServiceImple.findAll();
	}
	
	@PostMapping(path = "/create")
	public @ResponseBody Autor create(@RequestBody AutorDTO autordto) {
		
		Autor autor = AutorMapper.dtoToEntity(autordto);
		
		return autorServiceImple.create(autor);
	}
	
		
	
	 

}
