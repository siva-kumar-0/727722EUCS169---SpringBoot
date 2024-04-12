package com.project1.day4.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project1.day4.model.Patient;
import com.project1.day4.repository.PatientRepo;

@Service
public class PatientService 
{

    @Autowired
    PatientRepo PR;

    public Patient store(Patient P)
    {
        return PR.save(P);
    }

    public List<Patient> getAllPatientDatas()
    {
        return PR.findAll();
    }

    public Optional<Patient> getById(int id)
    {
        return PR.findById(id);
    }

}
