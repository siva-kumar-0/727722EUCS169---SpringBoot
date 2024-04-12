package com.project1.day4.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Medicine 
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int medicineId;

    public String medicineFor,manufactureDate;
    public double medicinePrice;
    public String getMedicineFor() {
        return medicineFor;
    }
    public void setMedicineFor(String medicineFor) {
        this.medicineFor = medicineFor;
    }
    public String getManufactureDate() {
        return manufactureDate;
    }
    public void setManufactureDate(String manufactureDate) {
        this.manufactureDate = manufactureDate;
    }
    public double getMedicinePrice() {
        return medicinePrice;
    }
    public void setMedicinePrice(double medicinePrice) {
        this.medicinePrice = medicinePrice;
    }
    
    public Medicine(int medicineId, String medicineFor, String manufactureDate, double medicinePrice) {
        this.medicineId = medicineId;
        this.medicineFor = medicineFor;
        this.manufactureDate = manufactureDate;
        this.medicinePrice = medicinePrice;
    }
    public Medicine(){}
    public int getMedicineId() {
        return medicineId;
    }
    public void setMedicineId(int medicineId) {
        this.medicineId = medicineId;
    }
}
