package com.company.basiclearning;

public class TowDiminutionArrayChallenge {
    public static void main(String[] args) {
        int[][] A={{1,1,1},{2,2,2},{3,3,3}};
        int [][] B = {{1,1,1},{2,2,2},{3,3,3}};
        int [][] C = new int[3][3];
        int [][] D= new int [3][3];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j <A[i].length ; j++) {
                System.out.print(A[i][j]+B[i][j]+" ");
                C[i][j]=A[i][j]+B[i][j];
                D[i][j]=A[i][j]*B[i][j];
            }
            System.out.println("");
        }
        System.out.println("------------");
        for(int c[]:C){
            for(int x:c){
                System.out.print(x + " ");
            }
            System.out.println("");
        }
        System.out.println("----/////--------");
        for(int c[]:D){
            for(int x:c){
                System.out.print(x + " ");
            }
            System.out.println("");
        }
        String languages []= {"java","python","ada","basic","c++","nodejs"};
        java.util.Arrays.sort(languages);
        for(String st :languages){
            System.out.print(st + " ");
        }
    }
}
