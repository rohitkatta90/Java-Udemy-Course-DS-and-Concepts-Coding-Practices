package factorialPractice;

import java.util.Scanner;

public class FactorialTest {

    public static void main(String args[]){

        System.out.println("Please enter any number: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int fact=1;

        for(int i=1;i<=number;i++){
            fact=fact*i;
        }
        System.out.println("Factorial of "+number+" is "+fact);
    }
}
