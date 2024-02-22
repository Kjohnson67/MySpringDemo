package com.example.demo.service;

import com.example.demo.domain.Book;
import com.example.demo.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class BookService {
    private final BookRepository bookRepository;
    //dependency injection: design pattern used in software development to achieve inversion of control between classes and their dependency
    //insert a book into our h2 database

    /*@Autowired
    //instead of instantiating bookRepository inside this class directly, we let Spring framework inject it for us
    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }*/
    @Transactional
    public Book create(Book book) {
        return bookRepository.save(book);
    }

    @Transactional
    public List<Book> findAll() {
        return bookRepository.findAll();
    }
}

//dependence injection is a design pattern used in software engineering to
//achieve inversion of control between classes an their dependencies
//it allows for the decoupling of components by making them independent
//of the concrete implementation
