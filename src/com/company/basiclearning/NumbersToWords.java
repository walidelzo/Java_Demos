package com.company.basiclearning;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NumbersToWords {
    public static void main(String[] args) {
        System.out.println("Enter the number ");
        String wordsOfNumbers[] ={"zero","one","tow","three","four","five","six","seven","eight","night"};
        Scanner sc = new Scanner(System.in);
        int inputNumbers = sc.nextInt();
        int reminder = 0;
        List<String>allNumberInWords = new ArrayList<String>();
        while(inputNumbers>0){
            reminder = inputNumbers%10;
            inputNumbers = inputNumbers/10;
            allNumberInWords.add(wordsOfNumbers[reminder]);
           // System.out.println(reminder);
        }
        String str = "";
        int i =allNumberInWords.size()-1;
        while(i>=0){
            System.out.println(allNumberInWords.get(i));
              str = str +allNumberInWords.get(i)+" ";
            i--;
        }
        System.out.println(str);
    }
}
