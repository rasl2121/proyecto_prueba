package com.tcs.training.proyecto_prueba.mappers;

import com.tcs.training.proyecto_prueba.mongo.entities.BookEntity;
import com.tcs.training.proyecto_prueba.request.BookRegisterRequest;

public class BookRegisterRequestMapper {

	public BookEntity mapIn(BookRegisterRequest request) {
		BookEntity book = new BookEntity();
		book.setName(request.getName());
		book.setAuthor(request.getAuthor());
		book.setPublicationYear(request.getPublicationYear());
		return book;
		
	}
}
