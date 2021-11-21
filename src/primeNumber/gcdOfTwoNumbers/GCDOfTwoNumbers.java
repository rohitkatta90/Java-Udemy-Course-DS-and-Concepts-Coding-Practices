package primeNumber.gcdOfTwoNumbers;

//The highest multiple common to both the numbers.
//Logic is simple, check the code.

import java.util.Scanner;

public class GCDOfTwoNumbers {

    static int gcd(int m, int n){

        int a=m;
        int b=n;
        while(a!=b){
            if(a>b){
                a=a-b;
            }else{
                b=b-a;
            }
        }
        return a;
    }

    public static void main(String args[]){

        System.out.println("Please enter any 2 numbers: ");
        Scanner scan= new Scanner(System.in);
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        //int c = gcd(a,b);
        System.out.println(gcd(num1,num2));

    }



}
