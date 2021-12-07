package com.company.basiclearning;

import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        //0,1,1,2,3,5,8,13,....
        System.out.println(" Enter the first ,second and the length");
        Scanner sc = new Scanner(System.in);
        int first,second,length,next;
        first =sc.nextInt();
        second = sc.nextInt();
        length = sc.nextInt();
        System.out.print(first+ " , " + second + " , ");
        for (int i = 0; i < length; i++) {
            next = second+first;
            first = second;
            second = next;
            System.out.print(next+" ,");
        }
    }
}
