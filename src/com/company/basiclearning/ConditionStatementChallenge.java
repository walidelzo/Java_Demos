package com.company.basiclearning;

import java.util.Scanner;

public class ConditionStatementChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

/*

        System.out.println("Enter the number");
        int inputNumber = sc.nextInt();
        if ((inputNumber % 2)==0)
        {
            System.out.println("the number is even");
        }else
        {
            System.out.println("the number is odd");
        }

        System.out.println("enter the age of the person");
        int theAge = sc.nextInt();
        if (theAge>=12&&theAge<55)
        {
            System.out.println("is young");
        }else {
            System.out.println("not young");
        }
*/
        ///the average of degrees
        int m1,m2,m3;
        m1=sc.nextInt();
        m2=sc.nextInt();
        m3=sc.nextInt();
        int total = m1+m2+m3;
        System.out.println(total);
        double average = (total/150f)*100;
        System.out.println("the average is :" + average);
        if (average>=70)
        {
            System.out.println("your grade is A");
        }else if(average<70 && average>=60){
            System.out.println("your grade is B");
        }else if (average<60 && average>=50){
            System.out.println("your grade is C");
        }else if (average<50 && average>=40){
            System.out.println("your grade is D");
        }else{
            System.out.println("your grade is F");
        }
    }
}
