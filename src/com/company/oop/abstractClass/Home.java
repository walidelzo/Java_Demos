package com.company.oop.abstractClass;

public abstract class Home {
    int roomsCount;

    public float getArea() {
        return area;
    }

    private final float area;
    public float homePrice;

    public Home(int roomsCount,float area){
        this.roomsCount=roomsCount;
        this.area =area;
    }

    public abstract float getPrice() ;
}
