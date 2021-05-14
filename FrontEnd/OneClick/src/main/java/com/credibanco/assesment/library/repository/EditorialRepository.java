package com.credibanco.assesment.library.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.credibanco.assesment.library.model.Editorial;

@Repository
public interface EditorialRepository extends CrudRepository<Editorial, Long>{

}
