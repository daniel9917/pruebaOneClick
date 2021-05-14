package com.credibanco.assesment.library.controller;

import java.io.IOException;
import java.net.http.HttpResponse;
import java.security.Timestamp;
import java.util.Date;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.credibanco.assesment.library.HttpCustomResponse.HttpCustomBody;
import com.credibanco.assesment.library.dto.LibroDTO;
import com.credibanco.assesment.library.mapper.LibroMapper;
import com.credibanco.assesment.library.model.Libro;
import com.credibanco.assesment.library.serviceImpl.AutorServiceImpl;
import com.credibanco.assesment.library.serviceImpl.EditorialServiceImpl;
import com.credibanco.assesment.library.serviceImpl.LibroServiceImpls;

@CrossOrigin
@RestController
@RequestMapping("/libro")
public class LibroController {
	
	@Autowired
	LibroServiceImpls libroServiceImpls;
	
	@Autowired
	AutorServiceImpl AutorServiceImpl;
	
	@Autowired
	EditorialServiceImpl EditorialServiceImpl;
	
	@GetMapping("/find")
	public @ResponseBody Iterable<Libro> listAll(){
		Iterable<Libro> libroid = libroServiceImpls.findAll();
		libroid.forEach(
				new Consumer<Libro>() {
					@Override
					public void accept(Libro arg0) {
						arg0.setAutor_id(arg0.getAutor().getId());
						arg0.setEditorial_id(arg0.getEditorial().getId());
						
					}}
				);
		return libroid;
		
	}
	
	@PostMapping("/create")
	public @ResponseBody Object create(@RequestBody LibroDTO librodto) throws IOException{			
		
		
		if (librodto.getId_autor() == 0) {
			return "No se puede crear un libro sin autor.";
		}
		try {
			if (this.AutorServiceImpl.findById(librodto.getId_autor()) == null) {
				return "Error: No se puede registrar el libro ya que el autor no está registrado";
			}			
		}catch (final NoSuchElementException ex) {
			HttpCustomBody notFound = new HttpCustomBody(HttpStatus.NOT_FOUND.value(), 
											 "Resource Not Found", 
											 "No se encontró el autor.", 
											 (new Date()).toString(), 
											 "/libro/create");			
			ResponseEntity<HttpCustomBody> r =new ResponseEntity<HttpCustomBody>(notFound, HttpStatus.NOT_FOUND); 
			return r;			
		}
		try {
			if (this.EditorialServiceImpl.findById(librodto.getId_editorial()) == null) {
				return "Error: No se puede registrar el libro ya que la editorial no está registrado";
			}			
		}catch (final NoSuchElementException ex) {
			HttpCustomBody notFound = new HttpCustomBody(HttpStatus.NOT_FOUND.value(), 
											 "Resource Not Found", 
											 "No se encontró la editorial.", 
											 (new Date()).toString(), 
											 "/libro/create");			
			ResponseEntity<HttpCustomBody> r =new ResponseEntity<HttpCustomBody>(notFound, HttpStatus.NOT_FOUND); 
			return r;			
		}
	
		Libro libro = LibroMapper.dtoToEntity(librodto);
		libro.setAutor(this.AutorServiceImpl.findById(librodto.getId_autor()));
		libro.setEditorial(this.EditorialServiceImpl.findById(librodto.getId_editorial()));
		this.libroServiceImpls.create(libro);
		return librodto;
		
		
	}

}
