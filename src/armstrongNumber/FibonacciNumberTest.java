package armstrongNumber;

// 0,1,1,2,3,5,8,13,21,...

import java.util.Scanner;

public class FibonacciNumberTest {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        System.out.println("*** Program for Fibonacci series ***");
        System.out.println("Please enter the number of Terms");

        int n = scan.nextInt();
        int a=0, b=1;
        int c=0;
        System.out.print(a+","+b+",");

        for(int i=0;i<(n-2);i++){
            c=a+b;
            System.out.print(c+",");
            a=b;
            b=c;
        }
    }
}
