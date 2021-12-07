/*-----------------------------------------------------------------------------
 - Copyright (c) Walid Elzohery 11/18/21, 3:02 PM.                            -
 - All right Reserved.                                                        -
 -----------------------------------------------------------------------------*/

package com.company.genrics;

public class GenericClassInsertAndDelete<T> {

  public void insert(T t){
        System.out.println("inserted " + t.getClass().getName());
    }
  public void delete(T t){
        System.out.println("deleted" + t.getClass().getName());
    }
}
