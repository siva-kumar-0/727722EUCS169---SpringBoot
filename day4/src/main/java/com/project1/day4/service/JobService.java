package com.project1.day4.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project1.day4.model.Job;
import com.project1.day4.repository.JobRepo;

@Service
public class JobService 
{

    @Autowired
    JobRepo JR;

    public Job store(Job J)
    {
        return JR.save(J);
    }

    public List<Job> getAllJobs()
    {
        return JR.findAll();
    }

    public Optional<Job> getById(int id)
    {
        return JR.findById(id);
    }

}
