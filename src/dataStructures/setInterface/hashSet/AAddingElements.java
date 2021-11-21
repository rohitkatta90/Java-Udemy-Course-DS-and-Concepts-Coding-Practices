package dataStructures.setInterface.hashSet;

import java.util.HashSet;

public class AAddingElements {

    public static void main(String args[]){

        HashSet<String> hs = new HashSet<>();
        hs.add("Rohit");
        hs.add("All");
        hs.add("the");
        hs.add("best");
        hs.add(null); // NOTE: Null value can also be added to HashSet
        System.out.println(hs.add(null)); // Adding duplicate value returns false
        hs.add("for");
        hs.add("learning");
        hs.add("HashSet");

        System.out.println(hs); // Since HastSet is unordered, it may not print in the order added.

        for(String x : hs){ // For each loop used for printing.
            System.out.print(x+" ");
        }
    }
}
