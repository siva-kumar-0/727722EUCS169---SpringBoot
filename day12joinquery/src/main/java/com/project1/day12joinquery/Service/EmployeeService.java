package com.project1.day12joinquery.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project1.day12joinquery.Model.Employee1;
import com.project1.day12joinquery.Repository.EmployeeRepo;

@Service
public class EmployeeService 
{
    @Autowired
    EmployeeRepo ER;

    public Employee1 postdata(Employee1 E)
    {
        return ER.save(E);
    }

    public List<Employee1> InnerJoin()
    {
        return ER.InnerJoin();
    }

    public List<Employee1> LeftOuterJoin()
    {
        return ER.LeftOuterJoin();
    }

    public Employee1 getById(int id)
    {
        return ER.findById(id);
    }
}
