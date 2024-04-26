package com.project1.day11relations.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project1.day11relations.Model.StudentIDCard;

@Repository
public interface StudentIDCardRepo extends JpaRepository<StudentIDCard,Integer> {

}
