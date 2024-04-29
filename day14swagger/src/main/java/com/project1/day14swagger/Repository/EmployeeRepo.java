package com.project1.day14swagger.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project1.day14swagger.Model.Employee;

@Repository
public interface EmployeeRepo extends JpaRepository<Employee,Integer> 
{
    Employee findById(int id);
}
