package com.project1.day14swagger.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project1.day14swagger.Model.Book1;
import com.project1.day14swagger.Repository.BookRepo;

@Service
public class BookService 
{
    @Autowired
    BookRepo BR;

    public Book1 postdata(Book1 B)
    {
        return BR.save(B);
    }

    public List<Book1> getAll()
    {
        return BR.findAll();
    }

    public Book1 getById(int id)
    {
        return BR.findByBookId(id);
    }
}
