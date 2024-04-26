package com.project1.day12joinquery.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project1.day12joinquery.Model.Student3;
import com.project1.day12joinquery.Model.StudentDetails3;
import com.project1.day12joinquery.Repository.StudentDetailsRepo;

@Service
public class StudentDetailService 
{
    @Autowired
    StudentDetailsRepo SDR;

    @Autowired
    StudentService SS;

    public StudentDetails3 updateDetail(StudentDetails3 S,int id)
    {
        Student3 S1=SS.getById(id);
        S1.setStudentDetail(S);
        SS.postdata(S1);
        return S1.getStudentDetail();
    }

}
