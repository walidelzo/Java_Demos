package com.company.oop.abstractClass;

import com.company.oop.enumration.CarColor;

public abstract class Car {
    public String model;
    public CarColor color;
    public int doorCount;
    public abstract void run();
    public Car(String model,CarColor color,int doorCount){
        this.model = model;
        this.color = color;
        this.doorCount = doorCount;
    }
}
