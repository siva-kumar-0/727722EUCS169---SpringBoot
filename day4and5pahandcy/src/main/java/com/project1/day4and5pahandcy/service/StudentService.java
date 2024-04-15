package com.project1.day4and5pahandcy.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project1.day4and5pahandcy.model.Student;
import com.project1.day4and5pahandcy.repository.StudentRepo;

@Service
public class StudentService 
{
    @Autowired
    StudentRepo SR;

    public Student postdata(Student S)
    {
        return SR.save(S);
    }

    public Student updatedata(Student S)
    {
        return SR.save(S);
    }

    public List<Student> getAlldata()
    {
        return SR.findAll();
    }

    public Optional<Student> getByID(int id)
    {
        return SR.findById(id);
    }

    public void deleteByID(int id)
    {
        SR.deleteById(id);
    }
}
