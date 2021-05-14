package com.credibanco.assesment.library.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.credibanco.assesment.library.model.Libro;

@Repository
public interface LibroRepository extends CrudRepository<Libro, Long>{

	List<Libro> findByAutorId (long id);
	List<Libro> findByEditorialId(long id);
}
