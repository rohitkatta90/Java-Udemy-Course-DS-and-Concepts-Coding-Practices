package armstrongNumber;

//Arithmetic Progression is  the series where the common difference of 2 consecutive number is always the same.
//eg: 5,10,15,20,...    Here the common difference between 2 consecutive numbers is always 5
//eg2 : 3,8, 13, 18, 23,...
//eg3 : 7,9,11,13,15,..
// Here in all the examples - a is the starting number, so from eg1, a = 5, d = common difference = 5 and n = total numbers to be printed.

import java.util.Scanner;

public class ArithmeticProgresstionSeriesTest {

    public static void main(String args[]){

        System.out.println("***** Program to print the Arithmetic Progression Series *****");
        System.out.println("Please enter values for a, d and n: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int d = scan.nextInt();
        int n = scan.nextInt();
        int term = a;
        for(int i =0; i<n ; i++){
            System.out.print(term+", ");
            term = term+d;
        }

    }
}
