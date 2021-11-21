package primeNumber;

import java.util.Scanner;

public class PrimeNumberCheck {

    public static boolean isPrime(int n){
        for(int i=2;i<(n/2);i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){

        System.out.println("Enter a number to check for Prime or not: ");
        Scanner scan = new Scanner(System.in);
        int number=scan.nextInt();
        boolean flag;
        flag=isPrime(number);
        if(flag==true){
            System.out.println("Its Prime");
        }else{
            System.out.println("Its NOT Prime");
        }

    }
}
