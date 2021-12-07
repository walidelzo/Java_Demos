/*-----------------------------------------------------------------------------
 - Copyright (c) Walid Elzohery 11/20/21, 10:09 AM.                           -
 - All right Reserved.                                                        -
 -----------------------------------------------------------------------------*/

package com.company.collections.sets;

import java.util.*;

public class TestSets {
    public static void main(String[] args) {
        Set<String> employeeSet = new TreeSet();
        employeeSet.add("Ahmed ali");
        employeeSet.add("mona ahmed");
        employeeSet.add("farah mohamed");
        for(String item:employeeSet){
            System.out.println("employee full name : " + item);
        }
        ///-------------test sets with
        Map<String,Product> productMap = new TreeMap();
        Product pen = new Product(1,"pen",12);
        Product pc = new Product(2,"Dell PC",2000);
        Product labtop = new Product(3,"HP Labtop",3200);
        Product mobile = new Product(4,"iphone 12",19000);
        Map<String,String> stringStringMap = new TreeMap<>();
        productMap.put("pen",pen);
        productMap.put("pc",pc);
        productMap.put("labtop",labtop);
        productMap.put("mobile",mobile);
        Set<String> productMapKeys = new TreeSet<>();
        productMapKeys = productMap.keySet();
        for(var key:productMapKeys){
            Product product = (Product)productMap.get(key);
            System.out.println(product.getName());
        }
    }
}
