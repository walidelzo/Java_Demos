/*-----------------------------------------------------------------------------
 - Copyright (c) Walid Elzohery 11/30/21, 8:17 PM.                            -
 - All right Reserved.                                                        -
 -----------------------------------------------------------------------------*/

package com.company.threads;

class MyThread extends Thread {
    public MyThread(String name) {
        // setPriority(Thread.MAX_PRIORITY);
    }

    public void run() {
        int i = 0;
        while (true) {
            i++;
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class TestThreadMethods {
    public static void main(String[] args) {
        MyThread myThread = new MyThread("my thread 1");
        System.out.println("ID :" + myThread.getId());
        System.out.println("priority :" + myThread.getPriority());
        System.out.println("name : " + myThread.getName());
        myThread.start();
        myThread.interrupt();
        System.out.println("state : " + myThread.getState());
        System.out.println("Alive :" + myThread.isAlive());

    }

}
