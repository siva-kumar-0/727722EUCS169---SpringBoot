package com.project1.day1.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class ApiController2 
{
    @GetMapping("/favoritecolor")
    public String getMethodName(@RequestParam String color) 
    {
        return "My Favorite Color is "+color+"!";
    }
    
}
