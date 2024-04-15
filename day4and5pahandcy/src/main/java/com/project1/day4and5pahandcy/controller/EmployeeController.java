package com.project1.day4and5pahandcy.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project1.day4and5pahandcy.model.Employee;
import com.project1.day4and5pahandcy.service.EmployeeService;

@RestController
public class EmployeeController 
{
    @Autowired
    EmployeeService ES;

    @GetMapping("/api/employees")
    public List<Employee> getAll()
    {
        return ES.getAll();
    }

    @PostMapping("/api/employee")
    public Employee postdata(@RequestBody Employee E)
    {
        return ES.postdata(E);
    }

    @GetMapping("/api/employee/{employeeId}")
    public Optional<Employee> getByid(@PathVariable int employeeId)
    {
        return ES.getById(employeeId);
    }
}
