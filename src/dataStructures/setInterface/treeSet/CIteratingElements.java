package dataStructures.setInterface.treeSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class CIteratingElements {

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
