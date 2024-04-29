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
public class Book 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title,genre,isbn;

    private int publicationYear;

    private double price;

    @ManyToOne(cascade = CascadeType.ALL)
    @JsonBackReference
    private Author author;
}
