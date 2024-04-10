package com.project1.day1.Model;

import org.springframework.web.bind.annotation.RestController;

import com.project1.day1.Response.Response;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class Model 
{
    @Value("${name}")
    String a;
    @Value("${Age}")
    int b;

    // @GetMapping("/Good")
    // public String Greet()
    // {
    //     return "வணக்கம் "+a+" "+b;
    // }
    @GetMapping("/Detail")
    public Response detail()
    {
        Response R=new Response(a, b);
        return R;
    }

}
