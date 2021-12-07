/*-----------------------------------------------------------------------------
 - Copyright (c) Walid Elzohery 11/29/21, 1:35 PM.                            -
 - All right Reserved.                                                        -
 -----------------------------------------------------------------------------*/

package com.company.exceptions;

public class TestException {
    public static void showMessage(String msg) {
        System.out.println(msg);
    }

    public static void main(String[] args) {
        try {
            showMessage("ali baba");
        } catch (Exception e) {

        }
    }
}
