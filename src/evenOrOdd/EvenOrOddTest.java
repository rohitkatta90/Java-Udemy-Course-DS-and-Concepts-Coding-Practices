package evenOrOdd;

import java.util.Scanner;

public class EvenOrOddTest {

    public static void main(String args[]){
        System.out.println("Please enter any number: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        LogicToTestEvenOdd obj = new LogicToTestEvenOdd();
        obj.testLogicEvenOdd(number);
    }
}
