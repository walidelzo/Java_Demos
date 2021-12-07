package com.company.basiclearning;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("enter the number");
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();
        int reversedNumber = 0;
        int reminder =0;
        while (inputNumber > 0) {
            reminder = inputNumber % 10;
            reversedNumber = reversedNumber*10+reminder;
            inputNumber = inputNumber/10;
        }
        System.out.println(reversedNumber);

    }
}
