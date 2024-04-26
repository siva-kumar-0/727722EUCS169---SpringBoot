package com.project1.day11relations.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project1.day11relations.Model.Student1;
import com.project1.day11relations.Model.StudentIDCard;
import com.project1.day11relations.Repository.StudentRepo;

@Service
public class StudentService 
{
    @Autowired
    StudentRepo SR;

    public Student1 postdata(Student1 S)
    {
        return SR.save(S);
    }

    public List<Student1> getAll()
    {
        return SR.findAll();
    }

    public Student1 getById(int id)
    {
        return SR.findById(id);
    }

    public Student1 updateSID(int id,StudentIDCard S)
    {
        Student1 S1=SR.findById(id);
        S1.setStudentIDCard(S);
        return SR.save(S1);
    }

    public String deleteById(int id)
    {
        if(SR.findById(id)!=null)
        {
            SR.deleteById(id);
            return "Deleted Student SuccessFully!";
        }
        else
        return "Student With ID : "+id+" Not Found!";
    }
}
