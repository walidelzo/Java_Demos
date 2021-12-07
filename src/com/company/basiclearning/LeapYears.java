package com.company.basiclearning;

import java.util.Scanner;

public class LeapYears {
    public static void main(String[] args) {
        System.out.println("enter the year");
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("leap year");
                } else {
                    System.out.println("common year");
                }
            } else {
                System.out.println("leap year");
            }
        } else {
            System.out.println("common year");
        }
    }
}
