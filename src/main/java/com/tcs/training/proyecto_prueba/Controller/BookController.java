package com.tcs.training.proyecto_prueba.Controller;

import com.tcs.training.proyecto_prueba.mappers.BookRegisterRequestMapper;
import com.tcs.training.proyecto_prueba.mappers.BookUpdateRequestMapper;
import com.tcs.training.proyecto_prueba.mongo.entities.BookEntity;
import com.tcs.training.proyecto_prueba.mongo.repository.BookRepository;
import com.tcs.training.proyecto_prueba.request.BookRegisterRequest;
import com.tcs.training.proyecto_prueba.request.BookUpdateRequest;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api-book")
public class BookController {
	@Autowired
	private BookRepository bookRepository;

	@GetMapping
	public ResponseEntity<List<BookEntity>> listAll() {
		return ResponseEntity.ok(bookRepository.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<BookEntity> findById(@PathVariable(name = "id") String id) {
		Optional<BookEntity> optionalBook = bookRepository.findById(id);
		if (optionalBook.isPresent()) {
			return ResponseEntity.ok(optionalBook.get());
		} else {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}

	}

	@PostMapping
	public ResponseEntity<BookEntity> register(BookRegisterRequest request) {
		return ResponseEntity.ok(bookRepository.save(new BookRegisterRequestMapper().mapIn(request)));

	}

	@PutMapping
	public ResponseEntity<BookEntity> update(BookUpdateRequest request) {
		return ResponseEntity.ok(bookRepository.save(new BookUpdateRequestMapper().mapIn(request)));

	}

	@DeleteMapping("/{id}")
	public ResponseEntity<BookEntity> delete(
			@PathVariable(name="id")String id) {
		bookRepository.deleteById(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);

	}
}
