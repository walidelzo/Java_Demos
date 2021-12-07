package com.company.basiclearning;

public class CopyArray {
    public static void main(String[] args) {
        int A[] = {12,13,14,17,21};
        int B[] =new int[10];
        for (int i = 0; i < A.length ; i++) {
            B[i]=A[i];
        }
        A=B;
        B=null;
        System.out.println(B);
        for(int a:A){
            System.out.print(a + " ");
        }

    }
}
