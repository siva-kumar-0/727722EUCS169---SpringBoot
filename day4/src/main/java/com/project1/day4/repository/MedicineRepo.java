package com.project1.day4.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project1.day4.model.Medicine;

public interface MedicineRepo extends JpaRepository<Medicine,Integer> {

}
