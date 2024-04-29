package com.project1.day14swagger.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project1.day14swagger.Model.Employee;
import com.project1.day14swagger.Model.Payroll;
import com.project1.day14swagger.Repository.EmployeeRepo;

@Service
public class EmployeeService 
{
    @Autowired
    EmployeeRepo ER;

    public Employee postdata(Employee E)
    {
        return ER.save(E);
    }

    public Employee findById(int id)
    {
        return ER.findById(id);
    }

    public List<Employee> getAll()
    {
        return ER.findAll();
    }

    public Payroll getPay(int id)
    {
        return findById(id).getPayroll();
    }

    public Payroll setpay(Payroll P,int id)
    {
        Employee E=findById(id);
        E.setPayroll(P);
        postdata(E);
        return E.getPayroll();
    }
}
