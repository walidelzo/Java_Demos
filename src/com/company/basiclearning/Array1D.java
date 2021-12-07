package com.company.basiclearning;

import java.util.Arrays;

public class Array1D {
    public static void main(String[] args) {
        //the ways of definition of array
        int[] arr = {1, 2, 3};
        int arr2[] = {1, 3, 5, 7, 9};
        int arr3[] = new int[4];

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + 1 + " ");
        }
        System.out.println("");
        for (int ar : arr2) {
            System.out.print(ar + " ");
        }
        //delete 7 from array
        int newArray[] = new int [arr2.length];
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] != 7){
                newArray[i] = arr2[i];
                ;}
        }
        System.out.println(" ");
        for (int a:newArray){
            System.out.print(a + " ");
        }

    }
}
