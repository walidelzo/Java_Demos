package com.company.basiclearning;

import java.util.Scanner;

public class DisplayDigitChallenge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNUmber = sc.nextInt();
        int reminder;
        while (inputNUmber>0){
            reminder= inputNUmber%10;
            inputNUmber = inputNUmber/10;
            System.out.println(reminder);
        }
    }
}
