package com.project1.day14swagger.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project1.day14swagger.Model.Book1;
import com.project1.day14swagger.Service.BookService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class BookController
{
    @Autowired
    BookService BS;

    @GetMapping("/api/book")
    public ResponseEntity<List<Book1>> getAll()
    {
        try{
            return new ResponseEntity<>(BS.getAll(),HttpStatus.OK);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/api/book/{bookId}")
    public ResponseEntity<Book1> getById(@PathVariable int bookId)
    {
        try{
            return new ResponseEntity<>(BS.getById(bookId),HttpStatus.OK);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/api/person")
    public ResponseEntity<Book1> postdata(@RequestBody Book1 B)
    {
        try{
            return new ResponseEntity<>(BS.postdata(B),HttpStatus.CREATED);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/api/person/{bookId}")
    public ResponseEntity<Book1> updatedata(@RequestBody Book1 B,@PathVariable int id)
    {
        try{
            return new ResponseEntity<>(BS.postdata(B),HttpStatus.CREATED);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
    
}
