/*-----------------------------------------------------------------------------
 - Copyright (c) Walid Elzohery 11/30/21, 11:03 AM.                           -
 - All right Reserved.                                                        -
 -----------------------------------------------------------------------------*/

package com.company.exceptions;

import java.io.*;

public class TextExceptionWithResources {
    public void tryToFind() throws IOException {
        try (FileInputStream fileInputStream = new FileInputStream("text.txt")) {
            System.out.println("as");
        } catch (Exception e) {
            System.out.println(e.getStackTrace());
        }
    }
}
