package com.project1.day14swagger.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project1.day14swagger.Model.Book1;


@Repository
public interface BookRepo extends JpaRepository<Book1,Integer> 
{

    Book1 findByBookId(int bookId);
    
}
