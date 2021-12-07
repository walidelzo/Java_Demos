package com.company.basiclearning;

public class ProtocolDetector {
    public static void main(String[] args) {
        String url = "ftp://www.google.net";
        //define the protocol
        System.out.println(url);
        String protocol;
        protocol = url.substring(0,url.indexOf(":"));
       // System.out.println(protocol);
       // protocol="ftp";
        if(protocol.equals("https")){
            System.out.println("the http protocol");
        }else
        if(protocol.equals("ftp")){
            System.out.println("the protocol is ftp");
        }
        //the type of website
        //com ===> commercial , org ==> organization , net ===>network
        String websiteType = url.substring(url.lastIndexOf(".")+1);
        //System.out.println(websiteType);
        if(websiteType.equals("com")){
            System.out.println("commercial website");
        }else if (websiteType.equals("org")){
            System.out.println("organization");
        }else {
            System.out.println("network website");
        }
    }
}
