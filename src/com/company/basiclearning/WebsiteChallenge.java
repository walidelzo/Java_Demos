package com.company.basiclearning;

import java.util.Scanner;

public class WebsiteChallenge {
    public static void main(String[] args) {
        System.out.println("enter the number of day");
        Scanner sc=new Scanner(System.in);
        int day=sc.nextInt();
        if(day==1){
            System.out.println("Saturday");
        }else if(day==2){
            System.out.println("sunday");
        }else if(day==3){
            System.out.println("monday");
        }else if(day==4){
            System.out.println("tuesday");
        }else if(day==5){
            System.out.println("wednesday");
        }else if(day==6){
            System.out.println("Thursday");
        }else {
            System.out.println("friday");

        }    }
}
