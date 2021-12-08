
/*-----------------------------------------------------------------------------
 - Copyright (c) Walid Elzohery ٨‏/١٢‏/٢٠٢١ ١:٣٢ م.                           -
 - All right Reserved.                                                        -
 -----------------------------------------------------------------------------*/

package com.company.functionalprogramming;


import java.util.List;


public class ProgrammingRunner {
    public static void main(String[] args) {
        List<String> lists = List.of("apple", "banana", "cat", "rat", "car","bar");
        TestFb testFb = new TestFb(lists);
        System.out.println("____________print without functioning programming__________________");
        testFb.printList();
        System.out.println("___________print with function programming___________________");
        testFb.printListFB();
        System.out.println("___________filter without function programming___________________");
        testFb.printListFilter();
        System.out.println("___________filter with function programming___________________");
        testFb.printWithFilter();

    }
}

record TestFb(List<String> list) {

    void printList() {
        for (String string : list) {
            System.out.println(string);
        }
    }

    void printListFilter() {
        for (String string : list) {
            if (string.endsWith("ar")) {
                System.out.println(string);
            }
        }
    }

    void printListFB() {
        list.forEach(System.out::println);
    }

    void printWithFilter() {
        list.stream().filter(e -> e.endsWith("at")).forEach(System.out::println);
    }
}

