package com.ahmadsolehin.repository;

import org.springframework.data.repository.CrudRepository;

import com.ahmadsolehin.models.Book;

/**
 * @author solehin
 *
 */
public interface BookRepository extends CrudRepository<Book, Integer>{

}
