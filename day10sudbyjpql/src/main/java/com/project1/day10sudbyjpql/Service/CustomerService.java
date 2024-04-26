package com.project1.day10sudbyjpql.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project1.day10sudbyjpql.Model.Customer1;
import com.project1.day10sudbyjpql.Repository.CustmoerRepo;

@Service
public class CustomerService 
{
    @Autowired
    CustmoerRepo CR;

    public Customer1 postdata(Customer1 C)
    {
        return CR.save(C);
    }

    public List<Customer1> getByCity(String a)
    {
        return CR.getByCity(a);
    }

    public List<Customer1> getAll()
    {
        return CR.findAll();
    }

    public Customer1 getById(int id)
    {
        return CR.getById(id);
    }

    public Customer1 updatePincode(int pin,int id)
    {
        CR.SetPincode(pin, id);
        return getById(id);
    }

    public void deleteById(int id)
    {
        CR.deleteById(id);
    }
}
