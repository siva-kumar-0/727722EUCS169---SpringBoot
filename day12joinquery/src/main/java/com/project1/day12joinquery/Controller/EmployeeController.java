package com.project1.day12joinquery.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project1.day12joinquery.Model.Employee1;
import com.project1.day12joinquery.Service.EmployeeService;

@RestController
public class EmployeeController 
{
    @Autowired
    EmployeeService ES;

    @GetMapping("/employees-inner-join")
    public ResponseEntity<List<Employee1>> getInnerJ()
    {
        try{
            return new ResponseEntity<>(ES.InnerJoin(),HttpStatus.OK);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/employees-left-outer-join")
    public ResponseEntity<List<Employee1>> getLeftOJ()
    {
        try{
            return new ResponseEntity<>(ES.LeftOuterJoin(),HttpStatus.OK);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/employee")
    public ResponseEntity<Employee1> postdata(@RequestBody Employee1 E)
    {
        try{
            return new ResponseEntity<>(ES.postdata(E),HttpStatus.CREATED);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    
    
}
