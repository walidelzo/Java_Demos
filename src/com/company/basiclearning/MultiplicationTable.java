package com.company.basiclearning;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        /*
        1x1=1 1x2=2 1x3=3 1x4=4 1x5=5 1x6=6 1x7=7 1x8=8
        2x2=4 2x3=6 2x4=8 2x5=1 2x10=20
         */
        System.out.println("Enter the first of table");
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        for (int i = 1; i <= n; i++) {
           for (int j = i; j <= n; j++) {
               System.out.print(i + "x" + j);
               System.out.print("="+(i*j)+" ");
            }
            System.out.println(" ");
        }
    }
}
