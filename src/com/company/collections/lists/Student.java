/*-----------------------------------------------------------------------------
 - Copyright (c) Walid Elzohery 11/20/21, 9:53 AM.                            -
 - All right Reserved.                                                        -
 -----------------------------------------------------------------------------*/

package com.company.collections.lists;

public class Student {
    private String name;
    private int degree;

    public Student(String name, int degree) {
        this.name = name;
        this.degree = degree;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDegree() {
        return degree;
    }

    public void setDegree(int degree) {
        this.degree = degree;
    }
}
