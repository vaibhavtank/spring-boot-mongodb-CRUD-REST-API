package com.javatechie.spring.mongo.api.thread;

import com.javatechie.spring.mongo.api.model.Book;
import com.javatechie.spring.mongo.api.repository.BookRepository;
import lombok.SneakyThrows;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.apache.http.Header;
import org.apache.http.HttpEntity;
import org.apache.http.HttpHeaders;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.IOException;

/**
 * @author vaibhav
 *
 */
@Service
public class ThreadScheduler implements Runnable{

    @Autowired
    private BookRepository repository;

    @SneakyThrows
    @Override
    public void run() {
        for (int i = 1; i<1000;i++) {
            Book book = new Book();
            book.setId(i);
            book.setBookName(String.valueOf(i));
            book.setAuthorName(String.valueOf(i));
            repository.save(book);
        }
        }
    }
