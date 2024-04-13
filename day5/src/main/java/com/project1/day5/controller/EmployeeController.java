package com.project1.day5.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.project1.day5.model.Employee;
import com.project1.day5.service.EmployeeService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class EmployeeController 
{
    @Autowired
    EmployeeService ES;

    @PostMapping("/api/employee")
    public Employee postdata(@RequestBody Employee E) 
    {
        return ES.postdata(E);
    }

    @PutMapping("/api/employee/{employeeId}")
    public Employee updatedata(@RequestBody Employee E,@PathVariable int employeeId) 
    {
        return ES.postdata(E);
    }

    @DeleteMapping("/api/employee/{employeeId}")
    public void delete(@PathVariable int employeeId)
    {
        ES.deleteById(employeeId);
    }
    
}
