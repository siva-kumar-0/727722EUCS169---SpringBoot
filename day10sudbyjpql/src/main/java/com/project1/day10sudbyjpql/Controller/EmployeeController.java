package com.project1.day10sudbyjpql.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.project1.day10sudbyjpql.Model.Employee1;
import com.project1.day10sudbyjpql.Service.EmployeeService;

@RestController
public class EmployeeController 
{
    @Autowired
    EmployeeService ES;

    @PostMapping("/api/employee")
    public ResponseEntity<Employee1> postdata(@RequestBody Employee1 E)
    {
        try{
            Employee1 E1=ES.postdata(E);
            return new ResponseEntity<>(E1,HttpStatus.CREATED);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/api/employee")
    public ResponseEntity<Employee1> updateSalary(@RequestParam int employeeId,@RequestParam int salary)
    {
        try{
            return new ResponseEntity<>(ES.updateSalary(employeeId, salary),HttpStatus.CREATED);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/api/employee/bySalary")
    public ResponseEntity<List<Employee1>> getBySalary(@RequestParam int salary)
    {
        try{
            return new ResponseEntity<>(ES.getBySalary(salary),HttpStatus.OK);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/api/employee")
    public ResponseEntity<String> deleteById(@RequestParam int employeeId)
    {
        try{
            ES.DeleteById(employeeId);
            return new ResponseEntity<>("Employee Deleted SuccessFully!",HttpStatus.OK);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
