package armstrongNumber;

//The sum of cubes of digits of a number is the same number. eg: 153

import java.util.Scanner;

public class ArmstrongNumberTest {

    public static void main(String args[]){

        System.out.println("Please enter any number: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int originalNumber=number;
        int remainder = 0;
        int sum=0;

        while(number>0){
            remainder = (number%10);
            sum=sum+(remainder*remainder*remainder);
            //System.out.println(remainder);
            number=number/10;
        }

        if(sum==originalNumber) {

            System.out.println("It is Armstrong number");
        }else{
            System.out.println("Not Armstrong");
        }

    }
}
