package armstrongNumber;

import java.util.Scanner;

public class DisplayDigitsOfNumber {

    public static void main(String args[]){

        System.out.println("Please enter any number: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int remainder = 0;

        while(number>0){
            remainder = (number%10);
            System.out.println(remainder);
            number=number/10;
        }

    }
}
