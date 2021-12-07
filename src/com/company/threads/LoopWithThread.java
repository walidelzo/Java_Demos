/*-----------------------------------------------------------------------------
 - Copyright (c) Walid Elzohery 11/30/21, 11:15 AM.                           -
 - All right Reserved.                                                        -
 -----------------------------------------------------------------------------*/

package com.company.threads;

public class LoopWithThread extends Thread{
    @Override
    public void run() {
        int i = 1;
        while (true){
            System.out.println(i + " poeple");
        }

    }
}
