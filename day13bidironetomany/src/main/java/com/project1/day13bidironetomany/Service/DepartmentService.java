package com.project1.day13bidironetomany.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project1.day13bidironetomany.Model.Department1;
import com.project1.day13bidironetomany.Model.Student1;
import com.project1.day13bidironetomany.Repository.DepartmentRepo;

@Service
public class DepartmentService 
{
    @Autowired
    DepartmentRepo DR;

    public Department1 postdata(Department1 D)
    {
        return DR.save(D);
    }

    public Department1 getById(int id)
    {
        return DR.findByDepartmentId(id);
    }

    public List<Department1> getAll()
    {
        return DR.findAll();
    }

    public List<Student1> getStudentById(int id)
    {
        return DR.findByDepartmentId(id).getStudent();
    }

    
}
