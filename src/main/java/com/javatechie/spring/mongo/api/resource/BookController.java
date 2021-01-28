package com.javatechie.spring.mongo.api.resource;

import java.util.List;
import java.util.Optional;

import com.javatechie.spring.mongo.api.thread.ThreadScheduler;
import com.javatechie.spring.mongo.api.thread.ThreadScheduler2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.javatechie.spring.mongo.api.model.Book;
import com.javatechie.spring.mongo.api.repository.BookRepository;

@RestController
public class BookController extends Thread{

	@Autowired
	private BookRepository repository;

	@GetMapping("/addBook")
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

	@GetMapping("/runThread")
	public String getThread() {
		Thread t = new Thread(new ThreadScheduler());
		Thread t2 = new Thread(new ThreadScheduler2());
		t.start();
		t2.start();
		return "";
	}

}
