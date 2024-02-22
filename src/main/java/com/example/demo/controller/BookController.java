package com.example.demo.controller;

import com.example.demo.domain.Book;
import com.example.demo.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;

    //import RESTful API here: returns the HTTP status, 404 means not found 200 means successful, 500 means server down
    // HTTP methods: GET, POST, PUT, and DELETE <--> CRUD in our h2 database
    @PostMapping("/book")
    public ResponseEntity<?> save(@RequestBody Book book) {
        return new ResponseEntity<>(bookService.create(book), HttpStatus.OK);
    }

    @GetMapping("/findAll")
    public ResponseEntity<?> findAll() {return new ResponseEntity<>(bookService.findAll(), HttpStatus.OK);}
    //httpstatus: 200 is ok, 201 is created, 404 is not fount, 500 is bad gateway
}
