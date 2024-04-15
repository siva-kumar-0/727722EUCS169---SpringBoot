package com.project1.day4and5pahandcy.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project1.day4and5pahandcy.model.Book;
import com.project1.day4and5pahandcy.repository.BookRepo;

@Service
public class BookService {

    @Autowired
    BookRepo BR;

    public Book postdata(Book B)
    {
        return BR.save(B);
    }

    public List<Book> getAll()
    {
        return BR.findAll();
    }

    public Optional<Book> getById(int id)
    {
        return BR.findById(id);
    }

}
