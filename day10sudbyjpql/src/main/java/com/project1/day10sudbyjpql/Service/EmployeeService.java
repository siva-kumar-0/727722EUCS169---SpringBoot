package com.project1.day10sudbyjpql.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project1.day10sudbyjpql.Model.Employee1;
import com.project1.day10sudbyjpql.Repository.EmployeeRepo;

@Service
public class EmployeeService 
{
    @Autowired
    EmployeeRepo ER;

    public Employee1 postdata(Employee1 E)
    {
        return ER.save(E);
    }

    public Employee1 updateSalary(int id,int salary)
    {
        ER.updateSalary(id, salary);
        return ER.getById(id);
    }

    public List<Employee1> getBySalary(int salary)
    {
        return ER.getGreaterThanSalary(salary);
    }

    public void DeleteById(int id)
    {
        ER.deleteById(id);
    }

}
