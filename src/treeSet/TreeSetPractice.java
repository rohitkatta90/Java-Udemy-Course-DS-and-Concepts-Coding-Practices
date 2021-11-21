package treeSet;

import java.util.List;
import java.util.TreeSet;


//Tree set is unordered
//TreeSet is sorted
//TreeSet will never display duplicates.

public class TreeSetPractice {

    public static void main(String args[]){
        TreeSet<Integer> ts = new TreeSet<>(List.of(10,20,30,60,50,70,40,10));
        ts.add(25);
        System.out.println(ts); //Here ts object will internally call the toString() method and print the values.
        System.out.println("Size of TreeSet is: "+ts.size());

    }
}
