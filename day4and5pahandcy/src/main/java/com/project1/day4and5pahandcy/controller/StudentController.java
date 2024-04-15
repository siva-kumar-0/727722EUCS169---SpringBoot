package com.project1.day4and5pahandcy.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project1.day4and5pahandcy.model.Student;
import com.project1.day4and5pahandcy.service.StudentService;

@RestController
public class StudentController 
{
    @Autowired
    StudentService SS;

    @GetMapping("/api/student/{studentId}")
    public Optional<Student> getById(@PathVariable int studentId)
    {
        return SS.getByID(studentId);
    }

    @GetMapping("/api/students")
    public List<Student> getAll()
    {
        return SS.getAlldata();
    }

    @PostMapping("/api/student")
    public Student postdata(@RequestBody Student S)
    {
        return SS.postdata(S);
    }

    @PutMapping("/api/students/{studentId}")
    public Student updatedata(@RequestBody Student S,@PathVariable int studentId)
    {
        return SS.updatedata(S);
    }

    @DeleteMapping("/api/students/{studentId}")
    public void deleteById(@PathVariable int studentId)
    {
        SS.deleteByID(studentId);
    }
}
