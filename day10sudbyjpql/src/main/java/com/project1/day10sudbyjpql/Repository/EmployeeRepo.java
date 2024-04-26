package com.project1.day10sudbyjpql.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.project1.day10sudbyjpql.Model.Employee1;

import jakarta.transaction.Transactional;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee1,Integer> 
{
    @Query("select E from Employee1 E where E.salary> :salary")
    List<Employee1> getGreaterThanSalary(int salary);

    @Modifying
    @Transactional
    @Query("update Employee1 E set E.salary = :salary where E.employeeId = :id")
    void updateSalary(int id,int salary);

    @Query("Select E from Employee1 E where E.employeeId= :id")
    Employee1 getById(int id);
}
