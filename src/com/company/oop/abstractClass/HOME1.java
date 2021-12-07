package com.company.oop.abstractClass;

public class HOME1 extends Home {

    public HOME1(int roomsCount, float area) {
        super(roomsCount, area);
    }

    @Override
    public float getPrice() {
       return super.homePrice = super.getArea() * 100f;
    }
}
