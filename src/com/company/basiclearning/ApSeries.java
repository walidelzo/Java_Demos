package com.company.basiclearning;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ApSeries {
    public static void main(String[] args) {
        System.out.println("enter the start of series: ");
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        System.out.println("enter the rate of series : ");
        int rate =sc.nextInt();
        System.out.println("enter the length : ");
        int length = sc.nextInt();
        List<String>series =new ArrayList<String>();
        for (int i =0, j= start; i < length ; i++,j=j+rate) {
            series.add(""+j);
        }
        System.out.println(series);

    }
}
