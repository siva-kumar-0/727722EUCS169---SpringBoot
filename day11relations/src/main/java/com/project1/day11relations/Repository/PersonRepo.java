package com.project1.day11relations.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project1.day11relations.Model.Person2;

@Repository
public interface PersonRepo extends JpaRepository<Person2,Integer> 
{

    Person2 findById(int id);
}
