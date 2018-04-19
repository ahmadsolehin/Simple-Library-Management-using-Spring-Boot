package com.ahmadsolehin.repository;

import org.springframework.data.repository.CrudRepository;

import com.ahmadsolehin.models.Author;

/**
 * @author solehin
 *
 */
public interface AuthorRepository extends CrudRepository<Author, Integer>{

}
