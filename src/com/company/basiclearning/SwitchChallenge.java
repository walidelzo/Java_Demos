package com.company.basiclearning;

public class SwitchChallenge {
    public static void main(String[] args) {
        /*
        switch accept (string,byte,short,int,long,char)
        the switch is faster than if else
        you  must write break after all cases
        */
            //switch in day
        int day =5;
        switch (day){
            case 1:
                System.out.println("saturday");
                break;
            case 2:
                System.out.println("sunday");
                break;
            case 3:
                System.out.println("monday");
                break;
            case 4:
                System.out.println("tuesday");
                break;
            case 5:
                System.out.println("wednesday");
                break;
            case 6:
                System.out.println("thursday");
                break;
            default:
                System.out.println("friday");
        }
        //switch on months
        byte month =9;
        switch(month)
        {
            case 1 :
                System.out.println("jan");
                break;
            case 2:
                System.out.println("feb");
                break;
            case 3:
                System.out.println("mar");
                break;
            case 4:
                System.out.println("april");
                break;
            case 5:
                System.out.println("may");
                break;
            case 6:
                    System.out.println("jun");
                    break;
            case 7:
                System.out.println("july");
                break;
            case 8:
                System.out.println("august");
                break;
            case 9:
                System.out.println("sept");
                break;
            case 10:
                System.out.println("oct");
                break;
            case 11:
                System.out.println("nov");
                break;
            case 12:
                System.out.println("dec");
                break;
        }

        String url = "http://www.yahoo.net";
        String websiteType = url.substring(url.lastIndexOf(".")+1);
        switch(websiteType) {
            case "com":
                System.out.println("commercial website");
                break;
            case "org":
                System.out.println("organization website");
                break;
            case "net":
                System.out.println("network website");
                break;
        }
    }
}
