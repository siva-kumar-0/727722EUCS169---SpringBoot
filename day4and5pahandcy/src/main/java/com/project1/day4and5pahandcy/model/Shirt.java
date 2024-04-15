package com.project1.day4and5pahandcy.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Shirt 
{
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int shirtId;

    public String shirtColor;
    public int shirtSize;
    public int getShirtId() {
        return shirtId;
    }
    public void setShirtId(int shirtId) {
        this.shirtId = shirtId;
    }
    public String getShirtColor() {
        return shirtColor;
    }
    public void setShirtColor(String shirtColor) {
        this.shirtColor = shirtColor;
    }
    public int getShirtSize() {
        return shirtSize;
    }
    public void setShirtSize(int shirtSize) {
        this.shirtSize = shirtSize;
    }
    public Shirt(int shirtId, String shirtColor, int shirtSize) {
        this.shirtId = shirtId;
        this.shirtColor = shirtColor;
        this.shirtSize = shirtSize;
    }

    public Shirt(){}
}
