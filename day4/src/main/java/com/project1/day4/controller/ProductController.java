package com.project1.day4.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.project1.day4.model.Product;
import com.project1.day4.service.ProductService;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class ProductController 
{

    @Autowired
    ProductService PS;

    @PostMapping("/api/product")
    public Product postproduct(@RequestBody Product P) 
    {
        return PS.store(P);
    }

    @GetMapping("/api/product")
    public List<Product> getAllProducts()
    {
        return PS.getAllProducts();
    }

    @GetMapping("/api/product/{productId}")
    public Optional<Product> getById(@PathVariable int productId)
    {
        return PS.getById(productId);
    }
    

}
