package com.spring.day2.model;


public class Student {

    private String Name;
    
    private int Register_No;
    private String Course;

    public String getName() {
        return Name;
    }


    public int getRegister_No() {
        return Register_No;
    }

    public void setRegister_No(int register_No) {
        Register_No = register_No;
    }

    public String getCourse() {
        return Course;
    }


    public Student(String name, int register_No, String course) {
        Name = name;
        Register_No = register_No;
        Course = course;
    }

    public Student(){}

}
