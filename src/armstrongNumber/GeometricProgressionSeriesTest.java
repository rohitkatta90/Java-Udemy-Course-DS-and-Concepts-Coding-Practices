package armstrongNumber;

//Geometric Progression
//eg1: 2,6,18,54,...    The ratio between 2 numbers is always same.
//eg2 : 5,10,20,40,...

import java.util.Scanner;

public class GeometricProgressionSeriesTest {

    public static void main(String args[]){

        System.out.println("***** Program to print the Geometric Progression Series *****");
        System.out.println("Please enter values for a, r and n: ");
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int r = scan.nextInt();
        int n = scan.nextInt();
        int term = a;
        for(int i =0; i<n ; i++){
            System.out.print(term+", ");
            term = term*r;
        }

    }
}
