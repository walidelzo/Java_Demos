package com.company.basiclearning;

import java.util.Scanner;

public class GeometricProgression {
    public static void main(String[] args) {
        System.out.println("Enter the start ,ratio , length :");
        Scanner sc = new Scanner(System.in);
        int start ,ratio,length,term;
        start = sc.nextInt();
        ratio = sc.nextInt();
        length = sc.nextInt();
        term = start;
        for (int i = 0; i < length; i++) {
            System.out.print(term +" ,");
            term =term*ratio;

        }
    }
}
