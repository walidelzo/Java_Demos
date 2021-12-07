package com.company.basiclearning;

import java.util.Scanner;

public class RadixNumberChallenge {
    public static void main(String[] args) {
        System.out.println("Enter the the number: ");
        Scanner sc = new Scanner(System.in);
        String number = sc.next();
        if (number.matches("[0-1]+"))
        {
            System.out.println("the number is binary");
        }else if(number.matches("[0-8]+")){
            System.out.println("the number is octal");
        }else if(number.matches("[0-9A-F]+")){
            System.out.println("the number is hexadecimal");
        }else {
            System.out.println("the number is decimal");
        }
    }
}
