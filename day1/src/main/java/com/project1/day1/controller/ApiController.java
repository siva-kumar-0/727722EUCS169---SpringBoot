package com.project1.day1.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class ApiController 
{

    @GetMapping("/welcome")
    public String Welcome()
    {
        return "Welcome SpringBoot!";
    }
    

}
