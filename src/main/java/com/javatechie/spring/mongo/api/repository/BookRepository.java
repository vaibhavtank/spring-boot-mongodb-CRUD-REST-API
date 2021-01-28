package com.javatechie.spring.mongo.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.javatechie.spring.mongo.api.model.Book;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;

public interface BookRepository extends MongoRepository<Book, Integer>{

}
