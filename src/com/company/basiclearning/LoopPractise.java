package com.company.basiclearning;

public class LoopPractise {
    public static void main(String[] args) {
        int n = 1;
        do {
            System.out.println(n);
            n = n * 2;
        }while (n < 100);
        System.out.println("----" + n);
        n=1;
        while(n<100){
            System.out.println(n);
            n=n*2;
        }
        for (int x=1,y=100,z=1; x<100; x++ ,y--,z=z*3){

            System.out.println(x + "--" + y + "--" + z);

        }    }
}
