package com.company.basiclearning;

import java.util.Scanner;

public class CountOfDigit {
    public static void main(String[] args) {
        System.out.println("Enter the number :");
       // Scanner sc = new Scanner(System.in);
        int inputNumber = 1000_000;
        int count =0;
        while(inputNumber>0){
            inputNumber = inputNumber/10;
                count ++;
        }
        System.out.println(count);
    }
}
