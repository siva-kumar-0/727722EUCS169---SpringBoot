package com.project1.day14swagger.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project1.day14swagger.Model.Employee;
import com.project1.day14swagger.Model.Payroll;
import com.project1.day14swagger.Service.EmployeeService;

import io.swagger.v3.oas.annotations.parameters.RequestBody;

@RestController
public class EmployeeController 
{
    @Autowired
    EmployeeService ES;

    @PostMapping("/employee")
    public ResponseEntity<Employee> postdata(@RequestBody Employee E)
    {
        try{
            return new ResponseEntity<>(ES.postdata(E),HttpStatus.CREATED);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping("/employee/{employeeId}/payroll")
    public ResponseEntity<Payroll> postpay(@RequestBody Payroll P,@PathVariable int employeeId)
    {
        try{
            return new ResponseEntity<>(ES.setpay(P, employeeId),HttpStatus.OK);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/employee")
    public ResponseEntity<List<Employee>> getAll()
    {
        try{
            return new ResponseEntity<>(ES.getAll(),HttpStatus.OK);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/employee/{employeeId}")
    public ResponseEntity<Employee> getEmpById(@PathVariable int employeeId)
    {
        try{
            return new ResponseEntity<>(ES.findById(employeeId),HttpStatus.OK);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/employee/{employeeId}/payroll")
    public ResponseEntity<Payroll> getpay(@PathVariable int employeeId)
    {
        try{
            return new ResponseEntity<>(ES.getPay(employeeId),HttpStatus.OK);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
    
}
