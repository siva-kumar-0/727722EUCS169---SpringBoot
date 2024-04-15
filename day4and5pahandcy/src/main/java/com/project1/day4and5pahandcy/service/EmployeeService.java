package com.project1.day4and5pahandcy.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project1.day4and5pahandcy.model.Employee;
import com.project1.day4and5pahandcy.repository.EmployeeRepo;

@Service
public class EmployeeService 
{
    @Autowired
    EmployeeRepo ER;

    public Employee postdata(Employee E)
    {
        return ER.save(E);
    }

    public List<Employee> getAll()
    {
        return ER.findAll();
    }

    public Optional<Employee> getById(int id)
    {
        return ER.findById(id);
    }

}
