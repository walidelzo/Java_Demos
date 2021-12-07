package com.company.basiclearning;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number... : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n;
        int sum =0 ;
        int r=0;
        while(n>0){
            r = n%10;
            sum = sum*10+r;
            n=n/10;
        }
        System.out.println("the reversed number is : "+sum);
        if (m==sum){
            System.out.println("this is palindrome number");
        }else{
            System.out.println("this not palindrome number");
        }
    }
}
