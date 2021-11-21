package stringPracticePrograms;

import java.util.Scanner;

public class NumberEvenOrOdd {

    public static void main(String args[]){

        int n;
        System.out.println("Please enter any number: ");
        Scanner sc = new Scanner(System.in);
        n = sc. nextInt();

        if(n%2==0){
            System.out.println("The entered number is even");
        }else {
            System.out.println("The entered number is odd");
        }
   }
}
