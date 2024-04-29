package com.project1.day14swagger.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Payroll 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long payrollId;

    private int noOfDaysWorked;
    private double amount;
}
