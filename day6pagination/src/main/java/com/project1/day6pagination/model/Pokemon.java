package com.project1.day6pagination.model;

import java.util.List;


import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Pokemon 
{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int pokemonId;

    public String name;
    @ElementCollection
    List<String>type,weakness,attacks;
    public double hp,ep,weight,height;

    
    public Pokemon(int pokemonId, String name, List<String> type, List<String> weakness, List<String> attacks,
            double hp, double ep, double weight, double height) {
        this.pokemonId = pokemonId;
        this.name = name;
        this.type = type;
        this.weakness = weakness;
        this.attacks = attacks;
        this.hp = hp;
        this.ep = ep;
        this.weight = weight;
        this.height = height;
    }




    public int getPokemonId() {
        return pokemonId;
    }




    public void setPokemonId(int pokemonId) {
        this.pokemonId = pokemonId;
    }




    public String getName() {
        return name;
    }




    public void setName(String name) {
        this.name = name;
    }




    public List<String> getType() {
        return type;
    }




    public void setType(List<String> type) {
        this.type = type;
    }




    public List<String> getWeakness() {
        return weakness;
    }




    public void setWeakness(List<String> weakness) {
        this.weakness = weakness;
    }




    public List<String> getAttacks() {
        return attacks;
    }




    public void setAttacks(List<String> attacks) {
        this.attacks = attacks;
    }




    public double getHp() {
        return hp;
    }




    public void setHp(double hp) {
        this.hp = hp;
    }




    public double getEp() {
        return ep;
    }




    public void setEp(double ep) {
        this.ep = ep;
    }




    public double getWeight() {
        return weight;
    }




    public void setWeight(double weight) {
        this.weight = weight;
    }




    public double getHeight() {
        return height;
    }




    public void setHeight(double height) {
        this.height = height;
    }




    public Pokemon(){}

}
