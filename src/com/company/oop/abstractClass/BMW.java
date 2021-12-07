package com.company.oop.abstractClass;

import com.company.oop.enumration.CarColor;

public class BMW extends Car{
    public BMW(String model, CarColor color, int doorCount) {
        super(model, color, doorCount);
    }

    @Override
    public void run() {
        System.out.println("th");
    }
}
