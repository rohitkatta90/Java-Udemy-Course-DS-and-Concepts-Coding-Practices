package stringPracticePrograms;

//Program to find the type of the website and then also tell the protocol used

import java.util.Scanner;

public class WebsiteTypeAndProtocol {

    public static void main(String args[]){
        System.out.println("Please enter the website: ");
        Scanner scan = new Scanner(System.in);
        String website = scan.nextLine();

        int colonIndex = website.indexOf(":");
        String protocol = website.substring(0,colonIndex);

        int dotIndexFromRight = website.lastIndexOf(".");
        String websiteType = website.substring((dotIndexFromRight+1),website.length());

        System.out.println("Protocol is : "+protocol);
        System.out.println("Website type is : "+websiteType);

        if(protocol.equals("http")){
            System.out.println("Protocol is Hyper Text Transfer Protocol");
        }else if(protocol.equals("https")){
            System.out.println("Protocol is Hyper Text Transfer Protocol Secure");
        }

        if(websiteType.equals("com")){
            System.out.println("Website type is Commercial");
        }else if(websiteType.equals("org")){
            System.out.println("Website type is Organization");
        }else if(websiteType.equals("net")){
            System.out.println("Website type is Network");
        }

    }
}
