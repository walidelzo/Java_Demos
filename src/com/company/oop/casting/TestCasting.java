package com.company.oop.casting;

public class TestCasting {
    public static void changeSpeed(Machine m,int speed){
        if(m instanceof Car) {
            Car c = (Car) m;
            c.setSpeed(speed);
        }

    }
    public static void main(String[] args) {
        Machine bmw1 = new Machine("12","bmw");
        Machine bmw2 = new Machine("12","bmw");
        changeSpeed(bmw1,123);
        System.out.println(bmw1.equals(bmw2));
    }


}
