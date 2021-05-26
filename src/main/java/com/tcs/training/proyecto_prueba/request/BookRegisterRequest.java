package com.tcs.training.proyecto_prueba.request;


import lombok.ToString;


@ToString
public class BookRegisterRequest {


	
	private String name;
	private Integer publicationYear;
	private String author;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getPublicationYear() {
		return publicationYear;
	}
	public void setPublicationYear(Integer publicationYear) {
		this.publicationYear = publicationYear;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}




	
}
