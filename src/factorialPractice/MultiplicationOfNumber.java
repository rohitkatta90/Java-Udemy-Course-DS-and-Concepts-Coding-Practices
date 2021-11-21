package factorialPractice;

import java.util.Scanner;

public class MultiplicationOfNumber {

    public static void main(String args[]){

        System.out.println("Please enter any number");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        for(int i =1 ; i<=10;i++){
            System.out.println(number+" * "+i+ " = "+(number*i));
        }
    }
}
