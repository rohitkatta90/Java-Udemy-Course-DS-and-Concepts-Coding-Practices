package parameterPassing;

public class ParameterPassingPractice {

    public static int add(int x , int y){ //this is called method
        return x+y;
    }
    public static void main(String args[]){
        int x=10;
        int y=20;
        int c;
        c = add(x,y); //This is the calling method
        System.out.println("Sum is : "+c);
    }
}
