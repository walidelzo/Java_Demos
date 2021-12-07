/*-----------------------------------------------------------------------------
 - Copyright (c) Walid Elzohery 11/22/21, 10:16 AM.                           -
 - All right Reserved.                                                        -
 -----------------------------------------------------------------------------*/

package com.company.collections.hashmap;

import java.util.Map;
import java.util.TreeMap;

public class TestHashMap {
    public static void main(String[] args) {
        TreeMap<Integer,String>treeMap = new TreeMap(Map.of(1,"walid",2,"manal",3,"yaseen",4,"mahmoud"));
        treeMap.put(5,"amr");
        treeMap.put(6,"mohamed");
        treeMap.put(7,"ali");
        System.out.println(treeMap);
        System.out.println(treeMap.ceilingKey(5));
        System.out.println(treeMap.firstEntry());
        System.out.println(treeMap.size());
        System.out.println(treeMap.lowerKey(6));
    }
}
