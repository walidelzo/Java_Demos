package com.company.basiclearning;

public class MaxInArray {
    public static int maxInArray(int[]array){
        int max = array[1];
        for (int ar:array){
            if(ar>max)
                max=ar;
        }
        return max;
    }

    public static void main(String[] args) {
        int arr [] = {34,56,63,12,4};
        System.out.println(maxInArray(arr));
    }
}
