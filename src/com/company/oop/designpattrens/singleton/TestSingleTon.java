
/*-----------------------------------------------------------------------------
 - Copyright (c) Walid Elzohery 2021.                                         -
 - All right Reserved.                                                        -
 -----------------------------------------------------------------------------*/

package com.company.oop.designpattrens.singleton;

public class TestSingleTon {
    public static void main(String[] args) {
       Connection x = Connection.getInstance();
       Connection y = Connection.getInstance();
       Connection z = Connection.getInstance();
        System.out.println(x.hashCode());
        System.out.println(y.hashCode());
        System.out.println(z.hashCode());
        System.out.println("-------------");
        System.out.println(x.str);
        System.out.println(y.str);
        System.out.println(z.str);
        x.str=x.str.toUpperCase();
        System.out.println(x.str);
        System.out.println(y.str);
        System.out.println(z.str);



    }
}
