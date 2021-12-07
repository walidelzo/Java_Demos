/*-----------------------------------------------------------------------------
 - Copyright (c) Walid Elzohery 11/18/21, 12:23 PM.                           -
 - All right Reserved.                                                        -
 -----------------------------------------------------------------------------*/

package com.company.oop.composition;

public class Department implements CanSupervised {
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void supervised(){
        System.out.println("can supervise other people... ");
    }
}
