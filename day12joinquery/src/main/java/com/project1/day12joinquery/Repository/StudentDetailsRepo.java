package com.project1.day12joinquery.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project1.day12joinquery.Model.StudentDetails3;

@Repository
public interface StudentDetailsRepo extends JpaRepository<StudentDetails3,Integer> {

}
