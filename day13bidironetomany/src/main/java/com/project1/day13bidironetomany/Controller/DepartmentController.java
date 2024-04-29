package com.project1.day13bidironetomany.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.project1.day13bidironetomany.Model.Department1;
import com.project1.day13bidironetomany.Model.Student1;
import com.project1.day13bidironetomany.Service.DepartmentService;
import com.project1.day13bidironetomany.Service.StudentService;

@RestController
public class DepartmentController 
{
    @Autowired
    DepartmentService DS;
    @Autowired
    StudentService SS;

    @PostMapping("/department")
    public ResponseEntity<Department1> postdata(@RequestBody Department1 D)
    {
        try{
            return new ResponseEntity<>(DS.postdata(D),HttpStatus.CREATED);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/department/{departmentId}/student")
    public ResponseEntity<Student1> mapstudent(@RequestBody Student1 S,@PathVariable int departmentId)
    {
        try{
            return new ResponseEntity<>(SS.mapStu(S, departmentId),HttpStatus.CREATED);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/department")
    public ResponseEntity<List<Department1>> getAll()
    {
        try{
            return new ResponseEntity<>(DS.getAll(),HttpStatus.OK);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
    @GetMapping("/department/student")
    public ResponseEntity<List<Student1>> getAllStu()
    {
        try{
            return new ResponseEntity<>(SS.getAll(),HttpStatus.OK);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/department/{departmentId}/student")
    public ResponseEntity<List<Student1>> getStusById(@PathVariable int departmentId)
    {
        try{
            return new ResponseEntity<>(DS.getStudentById(departmentId),HttpStatus.OK);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/department/student/{studentId}")
    public ResponseEntity<Student1> getStuById(@PathVariable int studentId)
    {
        try{
            return new ResponseEntity<>(SS.getById(studentId),HttpStatus.OK);
        }
        catch(Exception e)
        {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    
    
    
}
