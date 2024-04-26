package com.project1.day12joinquery.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project1.day12joinquery.Model.Address;
import com.project1.day12joinquery.Service.AddressService;

@RestController
public class AddressController 
{
    @Autowired
    AddressService AS;

    @PostMapping("/address/employee/{id}")
    public ResponseEntity<Address> postaddress(@RequestBody Address A,@PathVariable int id)
    {
        try{
            return new ResponseEntity<>(AS.updateAddress(A, id),HttpStatus.CREATED);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
