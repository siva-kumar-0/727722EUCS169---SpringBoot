package com.spring.day2.controller;

import org.springframework.web.bind.annotation.RestController;

import com.spring.day2.model.StudentPost;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class StudentPostController 
{

    @PostMapping("/PostStuDetails")
    public StudentPost postMethodName(@RequestBody StudentPost S) 
    {
        return S;
    }
    

}
