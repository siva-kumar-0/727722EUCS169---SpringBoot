package com.project1.day5.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project1.day5.model.Product;
import com.project1.day5.service.ProductService;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class ProductController 
{

    @Autowired
    ProductService PS;

    @PostMapping("/api/product")
    public Product Postdata(@RequestBody Product P)
    {
        return PS.postData(P);
    }

    @PutMapping("/api/product/{productId}")
    public Product update(@PathVariable String productId, @RequestBody Product P) 
    {
        return PS.updateData(P);
    }

    @DeleteMapping("/api/product/{productId}")
    public void deleteById(@PathVariable int productId)
    {
        PS.deleteById(productId);
    }

}
