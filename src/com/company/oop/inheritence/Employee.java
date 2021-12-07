package com.company.oop.inheritence;

public class Employee {
    public String getName() {
        return name;
    }


    private String name;
    private String ID;
    private float salary;
    Employee(String name,String ID,float salary){
        this.name = name;
        this.ID = ID;
        this.salary = salary+300;
    }
}
