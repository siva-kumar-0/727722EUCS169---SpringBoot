package com.spring.day2.model;

public class StudentPost 
{
    private String Name,Course;
    private int Reg_No;
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getCourse() {
        return Course;
    }
    public void setCourse(String course) {
        Course = course;
    }
    public int getReg_No() {
        return Reg_No;
    }
    public void setReg_No(int reg_No) {
        Reg_No = reg_No;
    }
    public StudentPost(String name, String course, int reg_No) {
        Name = name;
        Course = course;
        Reg_No = reg_No;
    }

}
