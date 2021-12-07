package com.company.basiclearning;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println("enter the number");
//        Scanner sc = new Scanner(System.in);
//        String str = sc.next();
//        char[] arrNumber = str.toCharArray();
//        for (int i =0;i<arrNumber.length;i++){
//            System.out.println(arrNumber[i]);
//        }
//
        Scanner sc = new Scanner(System.in);
        int inputNumber = sc.nextInt();
        int m = inputNumber;
        int reminder ;
        int sum=0;
        while(inputNumber>0){
            reminder = inputNumber%10;
            sum= sum + reminder*reminder*reminder;
            inputNumber = inputNumber/10;
        }
        System.out.println(sum);
        if (sum == m){
            System.out.println(" it is ArmStrong number");
        }else {
            System.out.println("it is not ");
        }

    }


}
