
/*-----------------------------------------------------------------------------
 - Copyright (c) Walid Elzohery ٨‏/١٢‏/٢٠٢١ ١:٣٢ م.                           -
 - All right Reserved.                                                        -
 -----------------------------------------------------------------------------*/

package com.company.functionalprogramming;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ProgrammingRunner {
    public static void main(String[] args) {
        List<String> lists = List.of("apple", "banana", "cat", "rat", "car","bar");
        // printlist(lists);
        TestFb testFb = new TestFb(lists);
        System.out.println("____________print without functioning programming__________________");
        testFb.printList();
        System.out.println("___________print with function programming___________________");
        testFb.printListFB();
        System.out.println("___________filter without function programming___________________");
        testFb.printListFilter("ar");
        System.out.println("___________filter with function programming___________________");
        testFb.printWithFilter();

    }
}

class TestFb {
    private List<String> list;

    TestFb(List<String> list) {
        this.list = list;
    }

    void printList() {
        for (String string : list) {
            System.out.println(string);
        }
    }

    void printListFilter(String fileterCerteria) {
        for (String string : list) {
            if(string.endsWith("ar"))
            System.out.println(string);
        }
    }

    void printListFB() {
        list.stream().forEach(element -> System.out.println(element));
    }

    void printWithFilter() {
        list.stream().filter(e -> e.endsWith("at")).forEach(e -> System.out.println(e));
    }
}

