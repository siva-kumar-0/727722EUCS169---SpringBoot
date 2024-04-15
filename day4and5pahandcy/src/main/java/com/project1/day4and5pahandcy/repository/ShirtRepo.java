package com.project1.day4and5pahandcy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project1.day4and5pahandcy.model.Shirt;

@Repository
public interface ShirtRepo extends JpaRepository<Shirt,Integer>{

}
