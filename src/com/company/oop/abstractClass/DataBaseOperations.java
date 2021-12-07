/*-----------------------------------------------------------------------------
 - Copyright (c) Walid Elzohery 12/7/21, 6:44 PM.                             -
 - All right Reserved.                                                        -
 -----------------------------------------------------------------------------*/

package com.company.oop.abstractClass;

public  abstract class DataBaseOperations {
    abstract void save(Object o );
    abstract void delete(Object o);
    abstract void update(Object o);
}
 class TestDataBaseOperations extends DataBaseOperations{

    @Override
    void save(Object o) {
        System.out.println("saved....");
    }

    @Override
    void delete(Object o) {
        System.out.println("deleted...");
    }

    @Override
    void update(Object o) {
        System.out.println("updated....");
    }

     public static void main(String[] args) {
        TestDataBaseOperations testDataBaseOperations = new TestDataBaseOperations();
         testDataBaseOperations.save(new Object());
         testDataBaseOperations.delete(new Object());
         testDataBaseOperations.update(new Object());
     }
}
