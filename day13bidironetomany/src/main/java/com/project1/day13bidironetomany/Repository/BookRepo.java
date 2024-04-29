package com.project1.day13bidironetomany.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project1.day13bidironetomany.Model.Book;

@Repository
public interface BookRepo extends JpaRepository<Book,Integer> 
{
    Book findById(int id);
}
