package com.project1.day12joinquery.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.project1.day12joinquery.Model.Employee1;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee1,Integer> 
{
    @Query("Select E from Employee1 E join E.address a")
    List<Employee1> InnerJoin();

    @Query("Select E from Employee1 E left outer join E.address a")
    List<Employee1> LeftOuterJoin();

    Employee1 findById(int id);
    
}
