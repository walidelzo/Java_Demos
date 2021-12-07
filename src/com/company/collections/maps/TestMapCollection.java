/*-----------------------------------------------------------------------------
 - Copyright (c) Walid Elzohery 11/20/21, 9:58 AM.                            -
 - All right Reserved.                                                        -
 -----------------------------------------------------------------------------*/

package com.company.collections.maps;

import java.util.Map;
import java.util.TreeMap;

public class TestMapCollection {
    public static void main(String[] args) {
        Screen hp = new Screen();
        hp.setModel("1234h");
        hp.setSize("19inch");
        Case dell = new Case();
        dell.setModel("5430d");
        dell.setHardSize(1000);
        dell.setRamSize(16);
        Map<Screen,Case> pcMap = new TreeMap<>();



    }
}
