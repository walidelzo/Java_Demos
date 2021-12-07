package com.company.basiclearning;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        System.out.println("Enter your numbers");
        Scanner sc = new Scanner(System.in);
        int n1,n2;
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        System.out.println("the sum :" + (n1+n2));
        System.out.println("the sub :" + (n1-n2));
        System.out.println("the multiply : " + (n1*n2));
        System.out.println("the division : " + (n1/n2));
    }
}
