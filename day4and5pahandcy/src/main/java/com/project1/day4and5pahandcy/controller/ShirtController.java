package com.project1.day4and5pahandcy.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project1.day4and5pahandcy.model.Shirt;
import com.project1.day4and5pahandcy.service.ShirtService;

@RestController
public class ShirtController 
{
    @Autowired
    ShirtService SS;

    @GetMapping("/shirt")
    public List<Shirt> getAll()
    {
        return SS.getAll();
    }

    @GetMapping("/shirt/{studentId}")
    public Optional<Shirt> getById(@PathVariable int shirtId)
    {
        return SS.getById(shirtId);
    }

    @PostMapping("/shirt")
    public Shirt post(@RequestBody Shirt S)
    {
        return SS.postdata(S);
    }

    @PutMapping("/shirt/{shirtId}")
    public Shirt update(@RequestBody Shirt S,@PathVariable int shirtId)
    {
        return SS.updatedata(S);
    }

    @DeleteMapping("/shirt/{shirtId}")
    public void deleteById(@PathVariable int shirtId)
    {
        SS.deleteById(shirtId);
    }
}
