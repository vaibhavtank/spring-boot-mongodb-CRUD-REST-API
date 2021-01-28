package com.javatechie.spring.mongo.api;

import com.javatechie.spring.mongo.api.model.Book;
import com.javatechie.spring.mongo.api.resource.BookController;
import com.javatechie.spring.mongo.api.thread.ThreadScheduler;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class SpringMongodbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMongodbApplication.class, args);
	}
}
