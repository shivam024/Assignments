package com.cg.author.service;

import com.cg.author.entities.Author;


public interface AuthorService {
	
	public abstract void addAuthor(Author author);

	public abstract void updateAuthor(Author author);

	public abstract void removeAuthor(Author author);

	public abstract Author findAuthorById(int id);

}
