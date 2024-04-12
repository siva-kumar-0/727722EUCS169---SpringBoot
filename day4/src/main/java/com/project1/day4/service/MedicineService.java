package com.project1.day4.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project1.day4.model.Medicine;
import com.project1.day4.repository.MedicineRepo;

@Service
public class MedicineService 
{

    @Autowired
    MedicineRepo MR;

    public Medicine Store(Medicine M)
    {
        return MR.save(M);
    }

    public List<Medicine> getAll()
    {
        return MR.findAll();
    }

    public Optional<Medicine> getById(int id)
    {
        return MR.findById(id);
    }

}
