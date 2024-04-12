package com.project1.day4.controller;

import org.springframework.web.bind.annotation.RestController;

import com.project1.day4.model.Job;
import com.project1.day4.service.JobService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class JobController 
{

    @Autowired
    JobService JS;

    @PostMapping("/api/job")
    public Job postJobs(@RequestBody Job J) 
    {
        return JS.store(J);
    }

    @GetMapping("/api/job")
    public List<Job> getAllJobs()
    {
        return JS.getAllJobs();
    }

    @GetMapping("/api/job/{jobId}")
    public Optional<Job> getById(@PathVariable int jobId)
    {
        return JS.getById(jobId);
    }
    

}
