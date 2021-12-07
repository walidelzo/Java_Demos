package com.company.basiclearning;

public class RegularExpressionChallenge {
    public static void main(String[] args) {
        String email="walidelzo@gmail.com";
        //get the domain name
        email = "walid@microsoft.com";
        System.out.println(" the domain name is :  " + email.substring(email.indexOf('@')+1,email.indexOf('.')));
        //get the user name of email
        System.out.println(" the user name is : " + email.substring(0,email.indexOf('@')));
        System.out.println("this is valid email = " + email.matches("[a-z]*@[a-z]*.com"));
    }

}
