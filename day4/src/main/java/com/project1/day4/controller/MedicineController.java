package com.project1.day4.controller;

import org.springframework.web.bind.annotation.RestController;

import com.project1.day4.model.Medicine;
import com.project1.day4.service.MedicineService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class MedicineController 
{

    @Autowired
    MedicineService MS;

    @PostMapping("/api/medicine")
    public Medicine postmedicine(@RequestBody Medicine M) 
    {
        return MS.Store(M);
    }

    @GetMapping("/api/medicines")
    public List<Medicine> getAllmedi() 
    {
        return MS.getAll();
    }

    @GetMapping("/api/medicine/{id}")
    public Optional<Medicine> getByid(@PathVariable int id) 
    {
        return MS.getById(id);
    }
    
    
    

}
