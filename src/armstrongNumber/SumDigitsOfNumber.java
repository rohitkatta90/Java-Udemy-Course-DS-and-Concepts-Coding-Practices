package armstrongNumber;

import java.util.Scanner;

public class SumDigitsOfNumber {

    public static void main(String args[]){

        System.out.println("Please enter any number: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int remainder = 0;
        int sum=0;

        while(number>0){
            remainder = (number%10);
            sum=sum+remainder;
            //System.out.println(remainder);
            number=number/10;
        }

        System.out.println("The sum of digits is : "+sum);

    }
}
