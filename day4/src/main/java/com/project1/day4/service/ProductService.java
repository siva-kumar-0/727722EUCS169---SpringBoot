package com.project1.day4.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project1.day4.model.Product;
import com.project1.day4.repository.ProductRepo;

@Service
public class ProductService 
{
    @Autowired
    ProductRepo PR;

    public Product store(Product P)
    {
        return PR.save(P);
    }

    public List<Product> getAllProducts()
    {
        return PR.findAll();
    }

    public Optional<Product> getById(int id)
    {
        return PR.findById(id);
    }
}
