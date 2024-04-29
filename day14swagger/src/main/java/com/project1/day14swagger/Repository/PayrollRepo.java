package com.project1.day14swagger.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project1.day14swagger.Model.Payroll;

@Repository
public interface PayrollRepo extends JpaRepository<Payroll,Integer> 
{
    Payroll findById(int id);
}
