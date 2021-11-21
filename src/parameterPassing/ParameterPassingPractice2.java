package parameterPassing;


//Strings are immutable even while parameter passing
//Where as in case of primitive data types, the values of variables are copied
// into variables used in called method.

// In case of non primitive data types, eg: Strings, the address of value
//is copied in the called method variable.

public class ParameterPassingPractice2 {

    public static void welcome (String n){ //this is called method
        System.out.println("Welcome Mr/Miss "+n);
    }
    public static void main(String args[]){
        String name="Victor";
        welcome(name);
    }
}
