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

import com.project1.day10sudbyjpql.Model.Customer1;
import com.project1.day10sudbyjpql.Service.CustomerService;

@RestController
public class CustomerController 
{
    @Autowired
    CustomerService CS;

    @PostMapping("/api/customer")
    public ResponseEntity<Customer1> postdata(@RequestBody Customer1 C)
    {
        try{
            Customer1 C1=CS.postdata(C);
            return new ResponseEntity<>(C1,HttpStatus.CREATED);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/api/customer/{customerId}/{pincode}")
    public ResponseEntity<Customer1> UpdatePincode(@PathVariable int customerId,@PathVariable int pincode)
    {
        try{
            Customer1 C1=CS.updatePincode(pincode, customerId);
            return new ResponseEntity<>(C1,HttpStatus.CREATED);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/api/customer")
    public ResponseEntity<List<Customer1>> getAll()
    {
        try{
            List<Customer1> C=CS.getAll();
            return new ResponseEntity<>(C,HttpStatus.OK);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/api/customer/{customerId}")
    public ResponseEntity<Customer1> getById(@PathVariable int customerId)
    {
        try{
            Customer1 C=CS.getById(customerId);
            return new ResponseEntity<>(C,HttpStatus.OK);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/api/customer/{city}")
    public ResponseEntity<List<Customer1>> getByCity(@PathVariable String city)
    {
        try{
            List<Customer1> C=CS.getByCity(city);
            return new ResponseEntity<>(C,HttpStatus.OK);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/api/customer/{customerId}")
    public ResponseEntity<String> deleteById(@PathVariable int customerId)
    {
        try{
            CS.deleteById(customerId);
            return new ResponseEntity<>("Customer Deleted SuccessFully!",HttpStatus.OK);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

}
