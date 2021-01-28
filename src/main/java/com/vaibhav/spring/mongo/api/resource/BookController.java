package com.vaibhav.spring.mongo.api.resource;

import java.util.List;
import java.util.Optional;

import com.vaibhav.spring.mongo.api.model.Book;
import com.vaibhav.spring.mongo.api.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class BookController extends Thread{

	@Autowired
	private BookRepository repository;

	@PostMapping("/addBook") // If @RequestBody not works use @ResponseBody
	public String saveBook(@RequestBody Book book) {
			repository.save(book);
		return "Added book : " + book;
	}

	@GetMapping("/findAllBooks")
	public List<Book> getBooks() {
		return repository.findAll();
	}

	@GetMapping("/findAllBooks/{id}")
	public Optional<Book> getBook(@PathVariable int id) {
		return repository.findById(id);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteBook(@PathVariable int id) {
		repository.deleteById(id);
		return "book deleted with id : " + id;
	}
}
