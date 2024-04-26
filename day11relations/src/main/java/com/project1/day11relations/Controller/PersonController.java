package com.project1.day11relations.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project1.day11relations.Model.Address;
import com.project1.day11relations.Model.Person2;
import com.project1.day11relations.Service.PersonService;

@RestController
public class PersonController 
{
    @Autowired
    PersonService PS;

    @PostMapping("/api/person")
    public ResponseEntity<Person2> postdata(@RequestBody Person2 P)
    {
        try{
            Person2 P1=PS.postPerson(P);
            return new ResponseEntity<>(P1,HttpStatus.CREATED);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    @PostMapping("/api/person/{id}")
    public ResponseEntity<Person2> postdata(@RequestBody Address A,@PathVariable int id)
    {
        try{
            return new ResponseEntity<>(PS.postAddress(A, id),HttpStatus.OK);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    @GetMapping("/api/person")
    public ResponseEntity<List<Person2>> getAll()
    {
        try{
            return new ResponseEntity<>(PS.getAllData(),HttpStatus.OK);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/api/person/{id}")
    public ResponseEntity<Person2> getById(@PathVariable int id)
    {
        try{
            return new ResponseEntity<>(PS.getById(id),HttpStatus.OK);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    

}
