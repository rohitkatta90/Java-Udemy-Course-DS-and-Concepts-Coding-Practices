package armstrongNumber;

import java.util.Scanner;


//This program prints reverse of a number and also checks if it is palindrome

public class ReverseNumber {

    public static void main(String args[]){

        System.out.println("Please enter any number: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int originalNumber=number;
        int remainder = 0;
        int revNum=0;

        System.out.println("Number is: "+number);
        while(number>0){
            remainder = (number%10);
            revNum = (revNum*10)+remainder;
            number=number/10;
        }

        System.out.println("Reverse is: "+revNum);

        if(originalNumber==revNum){
            System.out.println("The number is Palindrome");
        }else{
            System.out.println("The number is NOT Palindrome");
        }
    }
}
