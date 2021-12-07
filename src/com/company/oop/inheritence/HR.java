package com.company.oop.inheritence;

public class HR extends Employee{
    String address;
    float bonus;
    String subDepartment;
    HR(String name, String ID, float salary) {
        super(name, ID, salary);
    }
}
