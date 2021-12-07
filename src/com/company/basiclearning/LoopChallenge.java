package com.company.basiclearning;

public class LoopChallenge {
    public static void main(String[] args) {
        //multiply table
//        int n=5;
//        for (int i =1;i<=12;i++){
//            System.out.println(n + " X " + i + "= " + (i*n));
//        }
        //factorial number
        int x=1;
        for(int i =1 ;i<=8;i++){
            x = i*x;
        }
        System.out.println(x);
        //sum of n numbers
        x=0;
        for(int i =1;i<=7;i++){
            x=x+i;
        }
        System.out.println(x);

    }
}
