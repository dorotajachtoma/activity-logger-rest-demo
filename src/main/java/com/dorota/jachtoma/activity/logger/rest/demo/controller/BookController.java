package com.dorota.jachtoma.activity.logger.rest.demo.controller;

import com.dorota.jachtoma.activity.logger.rest.demo.model.Book;
import com.dorota.jachtoma.activity.logger.rest.demo.repository.BookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class BookController {

    private final BookRepository repository;


    @GetMapping("/books/all")
    private Iterable<Book> getAllBooks() {
        return repository.findAll();
    }
}
