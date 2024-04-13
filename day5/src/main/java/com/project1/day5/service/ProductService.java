package com.project1.day5.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project1.day5.model.Product;
import com.project1.day5.repository.ProductRepo;

@Service
public class ProductService 
{
    @Autowired
    ProductRepo PR;

    public Product postData(Product P)
    {
        return PR.save(P);
    }

    public void deleteById(int id)
    {
        PR.deleteById(id);
    }

    public Product updateData(Product P)
    {
        return PR.save(P);
    }
}
