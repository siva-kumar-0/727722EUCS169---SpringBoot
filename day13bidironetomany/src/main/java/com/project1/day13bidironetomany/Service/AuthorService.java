package com.project1.day13bidironetomany.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project1.day13bidironetomany.Model.Author;
import com.project1.day13bidironetomany.Repository.AuthorRepo;

@Service
public class AuthorService 
{
    @Autowired
    AuthorRepo AR;

    public Author postdata(Author A)
    {
        return AR.save(A);
    }

    public Author updatedata(Author A)
    {
        return AR.save(A);
    }

    public List<Author> getAllData()
    {
        return AR.findAll();
    }

    public Author getById(int id)
    {
        return AR.findById(id);
    }


}
