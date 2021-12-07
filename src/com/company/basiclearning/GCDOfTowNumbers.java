package com.company.basiclearning;

public class GCDOfTowNumbers {
    public static void main(String[] args) {
        System.out.println(gcdOfNumbers(100,120));
    }
    static int gcdOfNumbers(int n1 , int n2){
        while(n1!=n2){
            if (n1>n2){
                n1 = n1-n2;
            }else if(n2>n1){
                n2 = n2-n1;
            }
        }
        return n1;
    }
}
