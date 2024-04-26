package com.project1.day10sudbyjpql.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Product1 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;

    private String name,city,address,category;

    private int price,quantityInStock;
}
