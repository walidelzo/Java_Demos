/*-----------------------------------------------------------------------------
 - Copyright (c) Walid Elzohery 11/18/21, 3:16 PM.                            -
 - All right Reserved.                                                        -
 -----------------------------------------------------------------------------*/

package com.company.genrics.problem;

import java.util.Date;

public class NewsPaper {
    private String name;
    private Date date;

    public NewsPaper(String name, Date date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
