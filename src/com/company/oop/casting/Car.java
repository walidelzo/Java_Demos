package com.company.oop.casting;

public class Car extends Machine{
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    private int speed;
    public Car(String id, String name) {
        super(id, name);
    }

}
