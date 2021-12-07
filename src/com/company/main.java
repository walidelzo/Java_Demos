/*-----------------------------------------------------------------------------
 - Copyright (c) Walid Elzohery 11/22/21, 6:02 PM.                            -
 - All right Reserved.                                                        -
 -----------------------------------------------------------------------------*/

package com.company;

public class main {
   public static int check(int x) {
        return x;
    }
    public static void main(String[] args) {
        int x= 5;
        x= check(x);
        if( x==5 && x==10 && x==15){
            System.out.println("good...");
        }
    }
}
