package dataStructures.setInterface.treeSet;

import java.util.HashSet;
import java.util.TreeSet;

public class AAddingElements {

    public static void main(String args[]){

        TreeSet<String> hs = new TreeSet<>();
        hs.add("Rohit");
        hs.add("all");
        hs.add("the");
        hs.add("best");
        //hs.add(null); // NOTE: Null value CANNOT be added in TreeSet
        //System.out.println(hs.add(null));
        hs.add("for");
        hs.add("learning");
        hs.add("HashSet");

        System.out.println(hs); // Since TreeSet is sorted, it will print in the ascending order of the elements.

        System.out.println("*** Printing using For Each Loop ***");
        for(String x : hs){ // For each loop used for printing.
            System.out.print(x+" ");
        }
    }
}
