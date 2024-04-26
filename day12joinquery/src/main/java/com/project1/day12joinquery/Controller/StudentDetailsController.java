package com.project1.day12joinquery.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project1.day12joinquery.Model.StudentDetails3;
import com.project1.day12joinquery.Service.StudentDetailService;

@RestController
public class StudentDetailsController 
{

    @Autowired
    StudentDetailService SDS;

    @PostMapping("/studentDetail/student/{id}")
    public ResponseEntity<StudentDetails3> updateStudDetail(@RequestBody StudentDetails3 S,@PathVariable int id)
    {
        try{
            return new ResponseEntity<>(SDS.updateDetail(S, id),HttpStatus.CREATED);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
