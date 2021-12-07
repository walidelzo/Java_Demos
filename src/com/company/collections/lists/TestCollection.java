/*-----------------------------------------------------------------------------
 - Copyright (c) Walid Elzohery 11/20/21, 9:53 AM.                            -
 - All right Reserved.                                                        -
 -----------------------------------------------------------------------------*/

package com.company.collections.lists;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TestCollection {
    public static void main(String[] args) {
        List<Integer> studentDegree = new ArrayList<>();
        studentDegree.add(12);
        studentDegree.add(13);
        studentDegree.add(17);
        studentDegree.add(11);
        studentDegree.add(19);
        Iterator it = studentDegree.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("++++++++++++++++++++");
        List<Student> students = new ArrayList<>();
        students.add(new Student("ali",10));
        students.add( new Student("ahmed",9));
        students.add(new Student("zeko",12));
        students.add(new Student("memo",14));
        ListIterator<Student> studentIt = students.listIterator(4);
        while (studentIt.hasPrevious()){
            Student st = studentIt.previous();
            System.out.println(st.getName() + " -- "+ st.getDegree());
        }
//        for(Student stu:students){
//            System.out.println(stu.getName() + "+++++" + stu.getDegree());
//        }
        System.out.println("-------------");
        List<String> mobileList = new ArrayList<>(List.of("iphone 4","iphone 5","realmi","samsung","sony"));
        mobileList.forEach(System.out::println);
        mobileList.forEach(n->show(n));

    }
    static void show(String n){
        if(n.contains("rea"))
            System.out.println(n);
    }
}
