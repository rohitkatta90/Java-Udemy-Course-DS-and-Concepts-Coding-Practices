package evenOrOdd;

public class LogicToTestEvenOdd {

    public void testLogicEvenOdd(int number){

        if(number<=0){
            System.out.println("Please enter a valid number");
        }else if(number%2 == 0){
            System.out.println("The entered number is Even");
        }else{
            System.out.println("The entered number is Odd");
        }
    }
}
