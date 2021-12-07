/*-----------------------------------------------------------------------------
 - Copyright (c) Walid Elzohery 12/3/21, 2:45 PM.                             -
 - All right Reserved.                                                        -
 -----------------------------------------------------------------------------*/

package com.company.threads.snychronnization;

class Thread1 extends Thread {
    SharedData sharedData;

    Thread1(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
        sharedData.display("Hello world ");
    }
}

class Thread2 extends Thread {
    SharedData sharedData;

    Thread2(SharedData sharedData) {
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
        sharedData.display("Welcome");
    }
}

public class SharedData {
   synchronized public void display(String str) {

        for (int i = 0; i < str.length(); i++) {
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.print(str.charAt(i));
        }
    }
}

class test {
    public static void main(String[] args) {
        SharedData sharedData = new SharedData();
        Thread1 thread1 = new Thread1(sharedData);
        Thread2 thread2 = new Thread2(sharedData);
        thread1.start();
        thread2.start();

    }
}