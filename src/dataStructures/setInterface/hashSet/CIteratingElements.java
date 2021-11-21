package dataStructures.setInterface.hashSet;

import java.util.HashSet;
import java.util.Iterator;

public class CIteratingElements {

    public static void main(String args[]){

        HashSet<String> hs = new HashSet<>();
        hs.add("Rohit");
        hs.add("All");
        hs.add("the");
        hs.add("best");
        hs.add(null);
        hs.add("for");
        hs.add("learning");
        hs.add("HashSet");

        System.out.println("Before removing: "+hs); // Since HastSet is unordered, it may not print in the order added.

        // For each loop for iteration
        System.out.println("\n\n*** Printing using For Each loop ***");
        for(String x : hs){
            System.out.print(x+" ");
        }

        //Using Iterator Interface
        System.out.println("\n\n*** Printing using Iterator interface ***");
        Iterator<String> iterate = hs.iterator();
        while(iterate.hasNext()){
            System.out.print(iterate.next()+" ");
        }


    }
}
