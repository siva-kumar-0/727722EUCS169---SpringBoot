package com.project1.day12joinquery.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project1.day12joinquery.Model.Student3;
import com.project1.day12joinquery.Repository.StudnetRepo;

@Service
public class StudentService 
{
    @Autowired
    StudnetRepo SR;
    
    public Student3 getById(int id)
    {
        return SR.findById(id);
    }

    public Student3 postdata(Student3 S)
    {
        return SR.save(S);
    }

    public List<Student3> LeftOuterJoin()
    {
        return SR.LeftOuterJoin();
    }

    public List<Student3> InnerJoin()
    {
        return SR.InnerJoin();
    }

}
