package com.project1.day13bidironetomany.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project1.day13bidironetomany.Model.Department1;
import com.project1.day13bidironetomany.Model.Student1;
import com.project1.day13bidironetomany.Repository.StudentRepo;

@Service
public class StudentService 
{
    @Autowired
    StudentRepo SR;
    @Autowired
    DepartmentService DS;

    public List<Student1> getAll()
    {
        return SR.findAll();
    }

    public Student1 getById(int id)
    {
        return SR.findByStudentId(id);
    }

    public Student1 mapStu(Student1 S,int id)
    {
        Department1 D=DS.getById(id);
        List<Student1>S1=D.getStudent();
        S1.add(S);
        D.setStudent(S1);
        DS.postdata(D);
        return S;
    }
}
