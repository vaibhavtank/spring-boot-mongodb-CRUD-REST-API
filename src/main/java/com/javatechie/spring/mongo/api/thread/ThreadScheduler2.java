package com.javatechie.spring.mongo.api.thread;

import com.javatechie.spring.mongo.api.model.Book;
import com.javatechie.spring.mongo.api.repository.BookRepository;
import com.javatechie.spring.mongo.api.resource.BookController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ThreadScheduler2 implements Runnable{

    @Autowired
    private BookRepository repository;

    @Override
    public void run() {
        for (int i = 2; i<1000;i++){
            BookController bc = new BookController();
            List<Book> abc =repository.findAll();
            System.out.println(abc);
        }
    }
}
