package com.credibanco.assesment.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.credibanco.assesment.library.model.Libro;
import com.credibanco.assesment.library.repository.LibroRepository;

@RestController()
public class testController {

	@Autowired
	LibroRepository libroRepository;
	
	@RequestMapping(path = "/", method = RequestMethod.GET)
	public @ResponseBody String base() {
		return "hello";
	}
	
	@RequestMapping(path = "/hello", method = RequestMethod.GET)
	public @ResponseBody String test() {
		return "base de datos creada con exito";
	}
	
	@RequestMapping(path = "/libro",method = RequestMethod.GET)
	public @ResponseBody Iterable<Libro> getLibros() {
		return libroRepository.findAll();
	}
}
