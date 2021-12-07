/*-----------------------------------------------------------------------------
 - Copyright (c) Walid Elzohery 11/30/21, 11:13 AM.                           -
 - All right Reserved.                                                        -
 -----------------------------------------------------------------------------*/

package com.company.threads;


public class TestThreadsClass {
    public static void main(String[] args) {
        LoopWithThread thread = new LoopWithThread();
        thread.start();
        int i=0;
        while(true)
        {
            System.out.println(1+" word");
        }
    }
}
