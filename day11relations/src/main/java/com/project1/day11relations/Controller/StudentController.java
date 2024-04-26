package com.project1.day11relations.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project1.day11relations.Model.Student1;
import com.project1.day11relations.Model.StudentIDCard;
import com.project1.day11relations.Service.StudentService;

@RestController
public class StudentController 
{
    @Autowired
    StudentService SS;

    @PostMapping("/student")
    public ResponseEntity<Student1> postdata(@RequestBody Student1 S)
    {
        try{
            return new ResponseEntity<>(SS.postdata(S),HttpStatus.CREATED);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/student/{id}")
    public ResponseEntity<Student1> updatedata(@RequestBody StudentIDCard S,@PathVariable int id)
    {
        try{
            return new ResponseEntity<>(SS.updateSID(id, S),HttpStatus.OK);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
    @GetMapping("/student")
    public ResponseEntity<List<Student1>> getALl()
    {
        try{
            return new ResponseEntity<>(SS.getAll(),HttpStatus.OK);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/student/{id}")
    public ResponseEntity<Student1> getALl(@PathVariable int id)
    {
        try{
            return new ResponseEntity<>(SS.getById(id),HttpStatus.OK);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
    @DeleteMapping("/student/{id}")
    public ResponseEntity<String> deleteById(@PathVariable int id)
    {
        return new ResponseEntity<>(SS.deleteById(id),HttpStatus.OK);
    }
    
}
