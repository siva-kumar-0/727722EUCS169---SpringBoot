package com.project1.day11relations.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project1.day11relations.Model.Student1;

@Repository
public interface StudentRepo extends JpaRepository<Student1,Integer> 
{
    Student1 findById(int id);
}
