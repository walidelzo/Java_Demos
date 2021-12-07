package com.company.basiclearning;

public class TowDiminutionArray {
    public static void main(String[] args) {
        int A[][] = new int [3][] ;
        int B[][] = {{1,3,5,7,9,11},{2,4,6,8},{10,20,30,40}};
        A[0] = new int[3];
        A[1] = new int[4];
        A[2] = new int[5];
        ///
        for(int b[]:B){
            for(int x:b){
                System.out.print(x +" ");
            }
            System.out.println("");
        }
        System.out.println("===================");
        for(int i=0;i<B.length;i++){
            for (int j = 0; j <B[i].length ; j++) {
                System.out.print(B[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
