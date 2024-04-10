package com.spring.day2.controller;

import org.springframework.web.bind.annotation.RestController;

import com.spring.day2.model.Student;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class StudentController {

    @Value("${Name}")
    String a;
    @Value("${Course}")
    String b;

    @GetMapping("/GetStudentDetails")
    public Student getMethodName() 
    {
        return new Student(a, 169, b);
    }
    

}
