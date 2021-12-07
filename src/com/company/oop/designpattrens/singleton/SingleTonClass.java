
/*-----------------------------------------------------------------------------
 - Copyright (c) Walid Elzohery 2021.                                         -
 - All right Reserved.                                                        -
 -----------------------------------------------------------------------------*/

package com.company.oop.designpattrens.singleton;

public class SingleTonClass {
    private SingleTonClass(){}
    private final static SingleTonClass instance = new SingleTonClass();
    public static SingleTonClass getInstance(){
        return instance;
    }
   }
