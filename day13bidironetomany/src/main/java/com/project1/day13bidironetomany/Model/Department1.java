package com.project1.day13bidironetomany.Model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Data
@Entity
public class Department1 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int departmentId;

    private String departmentName,departmentEmail,headOfDepartment;

    @OneToMany(mappedBy = "department",cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Student1> student;
}
