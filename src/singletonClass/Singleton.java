package singletonClass;

/*
In object-oriented programming, a singleton class is a class that can have only one object (an instance of the class) at a time.

Remember the key points while defining class as singleton class that is while designing a singleton class:
1. Make constructor private.
2. Write a static method that has return type object of this singleton class. Here, the concept of Lazy initialization is used to write this static method.

 */

public class Singleton {

    private static Singleton singletonObj=null;
    public String s;
    private Singleton(){
        s="Hello I am a string part of Singleton class";
    }

    public static Singleton getInstance(){
        if(singletonObj==null){
            singletonObj=new Singleton();
        }
        return singletonObj;
    }

    public static void main(String args[]){

        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();
        Singleton s4 = Singleton.getInstance();

        System.out.println("Hascode of s2 is: "+s2.hashCode());
        System.out.println("Hascode of s3 is: "+s3.hashCode());
        System.out.println("Hascode of s4 is: "+s4.hashCode());

        // Condition check
        if (s2 == s3 && s3 == s4) {

            // Print statement
            System.out.println(
                    "Three objects point to the same memory location on the heap i.e, to the same object");
        }

        else {
            // Print statement
            System.out.println(
                    "Three objects DO NOT point to the same memory location on the heap");
        }

    }
}
