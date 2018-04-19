package com.ahmadsolehin.service;

import java.util.List;

import com.ahmadsolehin.models.Book;

/**
 * @author solehin
 *
 */
public interface BookService {
	
	public void addBook(Book book);
	
	public Book getBook(Integer bookId);
	
	public Book updateBook(Integer BookId,Book book);

	public void deleteBook(Integer bookId);

	public List<Book> getAllBooks();
}
