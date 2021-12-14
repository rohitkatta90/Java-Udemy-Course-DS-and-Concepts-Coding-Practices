package armstrongNumber;

import java.util.Scanner;

public class PrintDigitToWord {

    public static void main(String args[]) {

        System.out.println("Please enter any number: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int originalNumber = number;
        int remainder = 0;
        int revNum = 0;
        String str="";

        System.out.println("Number is: " + number);
        while (number > 0) {
            remainder = (number % 10);
            str = str+remainder; // This is the important step, each digit of the interger is being added to the string type variable.
            number = number / 10;
        }

        //System.out.println("The reverse of the number is: "+str);
        //System.out.println("The lenght of reverse of the number is: "+str.length());
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            switch(c){
                case '0': System.out.print("Zero ");
                    break;
                case '1': System.out.print("One ");
                    break;
                case '2': System.out.print("Two ");
                    break;
                case '3': System.out.print("Three ");
                    break;
                case '4': System.out.print("Four ");
                    break;
                case '5': System.out.print("Five ");
                    break;
                case '6': System.out.print("Six ");
                    break;
                case '7': System.out.print("Seven ");
                    break;
                case '8': System.out.print("Eight ");
                    break;
                case '9': System.out.print("Nine ");
                    break;
                default: System.out.println("Not a valid number..");
                    break;
            }
        }
    }
}
