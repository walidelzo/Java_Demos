package com.company.oop.inheritence;

public class Manager extends Employee{
    private String departName;
    Manager(String name,String ID,float salary, String departName){
        super(name,ID,salary);
    }
}
