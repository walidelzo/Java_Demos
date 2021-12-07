package com.company.basiclearning;

public class MethodOverride {
    public static int max(int n1,int n2){
        return n1>n2?n1:n2;
    }
    public static float max(float n1,float n2){
        return n1>n2?n1:n2;
    }
    static int max(int n1,int n2,int n3){
        return (n1>n2 && n1>n3)?n1:(n2>n1&&n2>n3 ?n2:n3);
    }


    public static void main(String[] args) {
        System.out.println(max(12,24));
        System.out.println(max(13,108,20));
    }
}
