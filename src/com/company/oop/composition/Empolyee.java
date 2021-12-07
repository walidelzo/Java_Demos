/*-----------------------------------------------------------------------------
 - Copyright (c) Walid Elzohery 11/18/21, 12:21 PM.                           -
 - All right Reserved.                                                        -
 -----------------------------------------------------------------------------*/

package com.company.oop.composition;

public class Empolyee implements CanSupervised {
    private Integer id;
    private String name;
    private String ssn;
    private Department department;

    public void supervised(){
        department.supervised();
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

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

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }
}
