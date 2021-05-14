package com.credibanco.assesment.library.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.credibanco.assesment.library.model.Autor;

@Repository
public interface AutorRepository extends CrudRepository<Autor, Long>{

}
