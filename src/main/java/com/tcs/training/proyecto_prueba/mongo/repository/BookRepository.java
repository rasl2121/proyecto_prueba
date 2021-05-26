package com.tcs.training.proyecto_prueba.mongo.repository;

import com.tcs.training.proyecto_prueba.mongo.entities.BookEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface BookRepository extends MongoRepository<BookEntity,String> {

}
