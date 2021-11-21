package stringPracticePrograms;

import java.util.Scanner;

public class RadixOfANmber {

    public static void main(String args[]){

        System.out.println("Please enter any number: ");
        Scanner scan = new Scanner(System.in);
        String num = scan.nextLine();

        if(num.matches("[01]+")){
            System.out.println("Binary Radix = 2");
        }else if(num.matches("[0-7]+")){
            System.out.println("Octal Radix = 8");
        }else if(num.matches("[0-9A-F]+")){
            System.out.println("Hexadecimal Radix=16");
        }else if(num.matches("[0-9]+")){
        System.out.println("Decimal Radix = 10");
        }else{
            System.out.println("Please enter a valid number");
        }

    }
}
