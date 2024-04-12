package com.project1.day4.controller;

import org.springframework.web.bind.annotation.RestController;

import com.project1.day4.model.Patient;
import com.project1.day4.service.PatientService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class PatientController 
{

    @Autowired
    PatientService PS;

    @PostMapping("/api/patient")
    public Patient store(@RequestBody Patient P)
    {
        return PS.store(P);
    }

    @GetMapping("/api/patient")
    public List<Patient> getAllPatients()
    {
        return PS.getAllPatientDatas();
    }

    @GetMapping("/api/patient/{patientId}")
    public Optional<Patient> getById(@PathVariable int patientId)
    {
        return PS.getById(patientId);
    }

}
