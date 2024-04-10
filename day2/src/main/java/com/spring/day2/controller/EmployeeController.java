package com.spring.day2.controller;

import org.springframework.web.bind.annotation.RestController;

import com.spring.day2.model.Employee;

import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class EmployeeController 
{

    @GetMapping("/GetEmployeeDetails")
    public Employee getMethodName() 
    {
        return new Employee("Ash Ketchum", "18", "1", "1000000000000000000",new Date());
    }
    

}
