package com.project1.day11relations.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project1.day11relations.Model.Address;
import com.project1.day11relations.Model.Person2;
import com.project1.day11relations.Repository.PersonRepo;

@Service
public class PersonService 
{
    @Autowired
    PersonRepo PR;

    public Person2 postdata(Person2 P)
    {
        return PR.save(P);
    }

    public Person2 postAddress(Address A,int id)
    {
        Person2 P=PR.findById(id);
        P.setAddress(A);
        return PR.save(P);
    }

    public Person2 postPerson(Person2 P)
    {
        return PR.save(P);
    }
    
    public Person2 getById(int id)
    {
        return PR.findById(id);
    }

    public List<Person2> getAllData()
    {
        return PR.findAll();
    }



}
