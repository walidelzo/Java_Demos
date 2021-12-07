/*-----------------------------------------------------------------------------
 - Copyright (c) Walid Elzohery 11/23/21, 1:29 PM.                            -
 - All right Reserved.                                                        -
 -----------------------------------------------------------------------------*/

package com.company.strings;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {
    public static void main(String[] args) {
        Properties properties = new Properties();
        try {
            FileInputStream fileInputStream = new FileInputStream("serverInfo.properties");
            properties.load(fileInputStream);
        }catch ( IOException e)
        {
            System.out.println(e.getMessage());
        }
        System.out.println(properties.getProperty("db.Name"));
        System.out.println(properties.getProperty("db.userName"));
        System.out.println(properties.getProperty("db.passWord"));
    }
}
