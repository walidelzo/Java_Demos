
/*-----------------------------------------------------------------------------
 - Copyright (c) Walid Elzohery 2021.                                         -
 - All right Reserved.                                                        -
 -----------------------------------------------------------------------------*/

package com.company.oop.designpattrens.singleton;

public class Connection {
    String str = "";
    void connect(){
        System.out.println("connected....");
    }
    void disConnect(){
        System.out.println("disconnected...");
    }
    private  static Connection instance = new Connection();
    private Connection(){
        str = "mysql database connection";
    }
    public  static Connection getInstance() {
        return instance;
    }
}
