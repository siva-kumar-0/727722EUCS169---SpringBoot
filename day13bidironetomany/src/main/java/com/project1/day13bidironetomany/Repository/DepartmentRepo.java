package com.project1.day13bidironetomany.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project1.day13bidironetomany.Model.Department1;


@Repository
public interface DepartmentRepo extends JpaRepository<Department1,Integer> 
{
    Department1 findByDepartmentId(int departmentId);
}
