package com.company.oop.abstractClass;

import com.company.oop.enumration.CarColor;

public class TestClass {
    public static void main(String[] args) {
        BMW bmw = new BMW("321i",CarColor.RED,5);
        //bmw.color = CarColor.GREEN;
        System.out.println(bmw.color);
        System.out.println(bmw.model);
        System.out.println(bmw.doorCount);
    }
}
