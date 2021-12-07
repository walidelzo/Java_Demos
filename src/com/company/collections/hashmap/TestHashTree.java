/*-----------------------------------------------------------------------------
 - Copyright (c) Walid Elzohery 11/22/21, 10:25 AM.                           -
 - All right Reserved.                                                        -
 -----------------------------------------------------------------------------*/

package com.company.collections.hashmap;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestHashTree {
    public static void main(String[] args) {
        Collection<String> hashSet = new HashSet<>(Set.of("ali","ahmed","saad","yousef"));
        hashSet.add("ali");
        hashSet.add("ali");
        hashSet.add("mido");
       // hashSet.clear();
        System.out.println( hashSet.contains("ali"));
        System.out.println(hashSet.size());
        System.out.println(hashSet);
        System.out.println( hashSet.isEmpty());
        hashSet.forEach((n)->modifyTheName(n));
       // System.out.println(modifyTheName("walid "));


    }
    static void modifyTheName(String name){
        name = name .concat(" Elzohery ");
        System.out.println(name);
    }
}
