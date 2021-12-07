/*-----------------------------------------------------------------------------
 - Copyright (c) Walid Elzohery 11/30/21, 8:46 PM.                            -
 - All right Reserved.                                                        -
 -----------------------------------------------------------------------------*/

package com.company.threads;
class MyThread2 extends Thread{
    public void run(){
        int i =1;
        while(i<100){
            i++;
            System.out.println("thread2 : " + i);
        }

//        try {
//            Thread.sleep(1000);
//        }catch (InterruptedException e){
//            System.out.println(e);
//        }
        System.out.println("---------------------------");
//
  }
}
public class ThreadYeildAndJoin {
    public static void main(String[] args) throws InterruptedException {
        MyThread2 myThread2 = new MyThread2();
        myThread2.start();

        Thread.sleep(3000);
        //myThread2.setPriority(Thread.MAX_PRIORITY);
        //Thread.currentThread().setPriority(Thread.MIN_PRIORITY);

        int i=1;
        while(i<100){
            i++;
            System.out.println("main thread " + i);
        }

    }
}
