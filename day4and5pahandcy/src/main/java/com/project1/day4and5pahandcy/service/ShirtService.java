package com.project1.day4and5pahandcy.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project1.day4and5pahandcy.model.Shirt;
import com.project1.day4and5pahandcy.repository.ShirtRepo;

@Service
public class ShirtService {

    @Autowired
    ShirtRepo SR;

    public Shirt postdata(Shirt S)
    {
        return SR.save(S);
    }

    public Shirt updatedata(Shirt S)
    {
        return SR.save(S);
    }

    public List<Shirt> getAll()
    {
        return SR.findAll();
    }

    public Optional<Shirt> getById(int id)
    {
        return SR.findById(id);
    }

    public void deleteById(int id)
    {
        SR.deleteById(id);
    }
}
