package com.project1.day13bidironetomany.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project1.day13bidironetomany.Model.Author;
import com.project1.day13bidironetomany.Service.AuthorService;

@RestController
public class AuthorController 
{
    @Autowired
    AuthorService AS;

    @PostMapping("/author")
    public ResponseEntity<Author> postdata(@RequestBody Author A)
    {
        try{
            return new ResponseEntity<>(AS.postdata(A),HttpStatus.CREATED);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/author/{authorId}")
    public ResponseEntity<Author> putdata(@RequestBody Author A,@PathVariable int authorId)
    {
        try{
            return new ResponseEntity<>(AS.updatedata(A),HttpStatus.OK);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    @GetMapping("/author/{authorId}")
    public ResponseEntity<Author> getById(@PathVariable int authorId)
    {
        try{
            return new ResponseEntity<>(AS.getById(authorId),HttpStatus.OK);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/author")
    public ResponseEntity<List<Author>> getAll()
    {
        try{
            return new ResponseEntity<>(AS.getAllData(),HttpStatus.OK);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    

}
