package com.project1.day4and5pahandcy.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.project1.day4and5pahandcy.model.Book;
import com.project1.day4and5pahandcy.service.BookService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class BookController 
{
    @Autowired
    BookService BS;

    @GetMapping("/api/book")
    public List<Book> getAlldata()
    {
        return BS.getAll();
    }

    @GetMapping("/api/book/{bookId}")
    public Optional<Book> getById(@PathVariable int bookId)
    {
        return BS.getById(bookId);
    }

    @PostMapping("/api/book")
    public Book postdaat(@RequestBody Book B) 
    {
        return BS.postdata(B);
    }
    
}
