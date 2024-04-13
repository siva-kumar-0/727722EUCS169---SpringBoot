package com.project1.day5.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project1.day5.model.Employee;
import com.project1.day5.repository.EmployeeRepo;

@Service
public class EmployeeService 
{

    @Autowired
    EmployeeRepo ER;

    public Employee postdata(Employee E)
    {
        return ER.save(E);
    }

    public Employee updateData(Employee E)
    {
        return ER.save(E);
    }

    public void deleteById(int id)
    {
        ER.deleteById(id);
    }

}
