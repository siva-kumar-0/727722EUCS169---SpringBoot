package com.project1.day10sudbyjpql.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project1.day10sudbyjpql.Model.Product1;
import com.project1.day10sudbyjpql.Service.ProductService;

@RestController
public class ProductController 
{
    @Autowired
    ProductService PS;

    @PostMapping("/api/product")
    public ResponseEntity<Product1> postdata(@RequestBody Product1 P)
    {
        try{
            Product1 P1=PS.postdata(P);
            return new ResponseEntity<>(P1,HttpStatus.CREATED);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/api/product/{category}")
    public ResponseEntity<List<Product1>> getByCategory(@PathVariable String category)
    {
        try{
            return new ResponseEntity<>(PS.getByCategory(category),HttpStatus.OK);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PutMapping("/api/product/{productId}/{quantityInStock}")
    public ResponseEntity<Product1> updateQuantity(@PathVariable int productId,@PathVariable int quantityInStock)
    {
        try{
            return new ResponseEntity<>(PS.updateQuantityInStock(productId, quantityInStock),HttpStatus.OK);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/api/product/{productId}")
    public ResponseEntity<String> deleteById(@PathVariable int productId)
    {
        try{
            PS.deleteById(productId);
            return new ResponseEntity<>("Product Deleted SuccessFully!",HttpStatus.OK);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
}
