package com.company.basiclearning;

public class PrimeNumberFind {
    static void isPrime(int number) {
        boolean isPrimeVar = false;
        for (int i = 2; i < 10; i++) {
            if (number % i == 0&&i!=number) {
                isPrimeVar = true;
                break;
            }
        }
        if (isPrimeVar == true) {
            System.out.println(" is not prime");
        } else {
            System.out.println(" is prime");
        }
    }
    static boolean isAPrimeNumber(int number){
        for (int i = 2; i <number/2 ; i++) {
            if (number%i==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int n =19;
        isPrime(n);
        if(isAPrimeNumber(n)==true){
            System.out.println("is prime number");
        }else{
            System.out.println(" no a prime number");
        }
    }
}
