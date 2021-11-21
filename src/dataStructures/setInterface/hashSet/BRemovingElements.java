package dataStructures.setInterface.hashSet;

import java.util.HashSet;

public class BRemovingElements {

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

        hs.remove(null);
        hs.remove("the");

        System.out.println("After removing: "+hs);

        for(String x : hs){ // For each loop used for printing.
            System.out.print(x+" ");
        }
    }
}
