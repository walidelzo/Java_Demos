package com.company.basiclearning;

import java.util.Scanner;

public class MenuDrivenMenu {
    public static void main(String[] args) {
        System.out.println("Welcome to the calculate program");

        System.out.println("Enter the tow numbers : ");
        Scanner sc = new Scanner(System.in);
        int n1,n2;
        n1=sc.nextInt();
        n2=sc.nextInt();

        System.out.println("----------Menu---------------");
        System.out.println("ADD");
        System.out.println("SUB");
        System.out.println("MUL");
        System.out.println("DIV");
        System.out.println("--------------------------");

        System.out.println("Enter your option: ");
        String option = sc.next();


        option = option.toUpperCase();
        switch(option){
            case "ADD":
                System.out.println("the sum of number : " + (n1+n2));
                break;
            case "SUB":
                System.out.println("the sub of numbers : "+(n1-n2));
                break;
            case "MUL":
                System.out.println("the multiplying : " + (n1*n2));
                break;
            case "DIV":
                System.out.println("the divided number  :" + (n1/n2));
                break;
            default:
                System.out.println("INVALID OPTION");
                break;
        }
    }
}
