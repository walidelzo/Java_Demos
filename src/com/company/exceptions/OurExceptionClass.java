/*-----------------------------------------------------------------------------
 - Copyright (c) Walid Elzohery 11/30/21, 11:09 AM.                           -
 - All right Reserved.                                                        -
 -----------------------------------------------------------------------------*/

package com.company.exceptions;

public class OurExceptionClass extends Exception{
    public String toString(){
        return  "you can not add value more than 1000 ";
    }

    @Override
    public synchronized Throwable getCause() {
        return super.getCause();
    }
}
