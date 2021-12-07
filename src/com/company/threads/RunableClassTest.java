/*-----------------------------------------------------------------------------
 - Copyright (c) Walid Elzohery 11/30/21, 11:26 AM.                           -
 - All right Reserved.                                                        -
 -----------------------------------------------------------------------------*/

package com.company.threads;

public class RunableClassTest implements Runnable{
    @Override
    public void run() {
        int i = 0;
        while (true){
            System.out.print(i+" hello  " );
            i++;
        }
    }

    public static void main(String[] args) {
        RunableClassTest runableClassTest = new RunableClassTest();
        Thread thread = new Thread(runableClassTest);
        thread.start();
        int i=0;
        while(true){
            System.out.print(i+" world");
            i++;
        }
    }
}
