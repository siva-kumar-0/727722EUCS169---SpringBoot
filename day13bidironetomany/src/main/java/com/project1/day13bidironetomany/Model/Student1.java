package com.project1.day13bidironetomany.Model;


import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Student1
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int studentId;

    private String name,email;
    private int age;

    @ManyToOne(cascade = CascadeType.ALL)
    @JsonBackReference
    private Department1 department;
}
