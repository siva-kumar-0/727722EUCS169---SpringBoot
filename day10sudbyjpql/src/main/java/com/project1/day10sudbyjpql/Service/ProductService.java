package com.project1.day10sudbyjpql.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project1.day10sudbyjpql.Model.Product1;
import com.project1.day10sudbyjpql.Repository.ProductRepo;

@Service
public class ProductService 
{
    @Autowired
    ProductRepo PR;
    
    public Product1 postdata(Product1 P)
    {
        return PR.save(P);
    }

    public List<Product1> getByCategory(String cat)
    {
        return PR.getByCategory(cat);
    }

    public Product1 updateQuantityInStock(int id,int stock)
    {
        PR.updateQuantity(id, stock);
        return PR.getById(id);
    }

    public void deleteById(int id)
    {
        PR.deleteById(id);
    }

}
