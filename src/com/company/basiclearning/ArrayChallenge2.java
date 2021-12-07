package com.company.basiclearning;

public class ArrayChallenge2 {
    public static void main(String[] args){
        //copy the array
        int array1[] = {2,4,6,8,10,12,14};
        int array2[] = new int[2*array1.length];
        int reverseArray[] = new int[array1.length];
        for (int a:array1){
            System.out.print(a +" ");
        }
        System.out.println("");
        for (int i = 0; i < array1.length; i++) {
            array2[i]=array1[i];
        }
        for (int a2:array2){
            System.out.print(a2+" ");
        }
        System.out.println("");
        for (int i = array1.length-1; i >=0 ; i--) {
            int index = array1.length -(i)-1;
            reverseArray[index]=array1[i];
        }
        for (int a:reverseArray){
            System.out.print(a + " ");
        }
        for(int i= reverseArray.length;i<array2.length;i++){
            array2[i]=reverseArray[i- reverseArray.length];
        }
        System.out.println("");
        for(int a:array2){
            System.out.print(a+" ");
        }
    }
}
