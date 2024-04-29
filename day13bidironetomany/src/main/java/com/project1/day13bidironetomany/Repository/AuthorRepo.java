package com.project1.day13bidironetomany.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project1.day13bidironetomany.Model.Author;


@Repository
public interface AuthorRepo extends JpaRepository<Author,Integer> 
{

    Author findById(int id);
    
}
