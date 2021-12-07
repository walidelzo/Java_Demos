/*
 * Copyright (c) Walid Elzohery 2021.
 * All right Reserved.
 */

package com.company.oop.interfaces;

public class Television implements ElectronicDevice{
    @Override
    public void turnOn() {
        System.out.println("tv is on...");
    }

    @Override
    public void turnOff() {
        System.out.println("tv is off ...");
    }
    public void print(){

        System.out.println(deviceName);
    }
}
