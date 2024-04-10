package com.spring.day2.model;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Employee 
{

    @JsonProperty("Employee Name")
    private String Employee_Name;

    @JsonProperty("Employee Age")
    private String Employee_Age;

    @Value("Employee Salary")
    private String Employee_Salary;
    
    @JsonIgnore
    private String Employee_Exp;

    @JsonFormat(pattern="yyyy-MM-dd")
    private Date JoinDate;

    public String getEmployee_Name() {
        return Employee_Name;
    }

    public void setEmployee_Name(String employee_Name) {
        Employee_Name = employee_Name;
    }

    public String getEmployee_Age() {
        return Employee_Age;
    }

    public void setEmployee_Age(String employee_Age) {
        Employee_Age = employee_Age;
    }

    public String getEmployee_Salary() {
        return Employee_Salary;
    }

    public void setEmployee_Salary(String employee_Salary) {
        Employee_Salary = employee_Salary;
    }

    public String getEmployee_Exp() {
        return Employee_Exp;
    }

    public void setEmployee_Exp(String employee_Exp) {
        Employee_Exp = employee_Exp;
    }
    

    public Employee(String employee_Name, String employee_Age, String employee_Salary, String employee_Exp,Date date) {
        Employee_Name = employee_Name;
        Employee_Age = employee_Age;
        Employee_Salary = employee_Salary;
        Employee_Exp = employee_Exp;
        JoinDate=date;
    }
    
    Employee(){}

    public Date getJoinDate() {
        return JoinDate;
    }

    public void setJoinDate(Date joinDate) {
        JoinDate = joinDate;
    }

}
