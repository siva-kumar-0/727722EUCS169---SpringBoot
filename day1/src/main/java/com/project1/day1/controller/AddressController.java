package com.project1.day1.controller;

import org.springframework.web.bind.annotation.RestController;

import com.project1.day1.Model.Address;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class AddressController 
{

    @GetMapping("/address")
    public Address print() 
    {
        return new Address("Ash Ketchum", "North Street", "628903", 0);
    }
    
}
