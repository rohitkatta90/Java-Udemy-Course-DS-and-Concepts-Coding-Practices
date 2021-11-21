package dataStructures.setInterface.treeSet;

import java.util.HashSet;
import java.util.TreeSet;

public class BRemovingElements {

    public static void main(String args[]){

        TreeSet<String> hs = new TreeSet<>();
        hs.add("Rohit");
        hs.add("All");
        hs.add("the");
        hs.add("best");
        hs.add("for");
        hs.add("learning");
        hs.add("HashSet");

        System.out.println("Before removing: "+hs); // Since TreeSet is sorted, it will print in the ascending order of the elements.

        hs.remove("the");

        System.out.println("After removing: "+hs);

        // For each loop used for printing.
        System.out.println("*** Printing using For Each Loop ***");
        for(String x : hs){
            System.out.print(x+" ");
        }
    }
}
