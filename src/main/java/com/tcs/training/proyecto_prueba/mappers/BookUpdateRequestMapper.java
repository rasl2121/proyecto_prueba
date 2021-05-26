package com.tcs.training.proyecto_prueba.mappers;

import com.tcs.training.proyecto_prueba.mongo.entities.BookEntity;
import com.tcs.training.proyecto_prueba.request.BookUpdateRequest;

public class BookUpdateRequestMapper {
public BookEntity mapIn(BookUpdateRequest request) {
	BookEntity book = new BookEntity();
	book.setId(request.getId());
	book.setName(request.getName());
	book.setAuthor(request.getAuthor());
	book.setPublicationYear(request.getPublicationYear());
	return book;
	
	
}
}
