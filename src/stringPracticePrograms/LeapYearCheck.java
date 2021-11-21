package stringPracticePrograms;

//Logic is to check if a year is divisible by 4 first. If yes, then it may be a leap year. After divisible by 4, check if the same year is divisible by
//100. If yes, then it may be a leap year. If not divisible by 100 then it is a leap year but if divisible by 100 the check if the same year is divisible
// by 400. If yes then it is surely a leap year else it is not a leap year.

import java.util.Scanner;

public class LeapYearCheck {

    public static void main(String args[]){
        System.out.println("Please enter any year: ");
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();

        if(year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println("Its a leap year!");
                }else{
                    System.out.println("Not a leap year!");
                }
            }else{
                System.out.println("Its a leap year!");
            }
        }else{
            System.out.println("Not a leap year!");
        }
    }

}
