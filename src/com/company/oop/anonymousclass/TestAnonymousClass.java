
/*-----------------------------------------------------------------------------
 - Copyright (c) Walid Elzohery ٩‏/١٢‏/٢٠٢١ ٨:٤١ ص.                           -
 - All right Reserved.                                                        -
 -----------------------------------------------------------------------------*/

package com.company.oop.anonymousclass;
class Machine {
    public void start(){
        System.out.println("machine start....");
    }
}
interface SmallMachine{
    public void start();
}
public class TestAnonymousClass {
    public static void main(String[] args) {
        //the traditional method
        Machine machine = new Machine();

        //but if I want to use the anonymous class the method here
        Machine car = new Machine(){
            @Override
            public void start() {
                System.out.println("car start");
            }
        };
        SmallMachine watch = new SmallMachine() {
            @Override
            public void start() {
                System.out.println("watch is starting ... ");
            }
        };

        machine.start();
        car.start();
        watch.start();

    }

}
