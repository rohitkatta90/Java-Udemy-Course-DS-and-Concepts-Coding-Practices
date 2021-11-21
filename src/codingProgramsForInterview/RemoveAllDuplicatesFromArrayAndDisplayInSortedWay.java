package codingProgramsForInterview;

import java.util.HashSet;
import java.util.TreeSet;

public class RemoveAllDuplicatesFromArrayAndDisplayInSortedWay {

    // FOR STRING ARRAY

    /*public static void main(String args[]){

        String arr[]={"Java","C","C++","Java","Python","C1"};
        int[] num={100,45,1,78,98,56,44,78,100,98};
        boolean flag=false;
        TreeSet<String> ts = new TreeSet<>();
        for(String l:arr){
            ts.add(l);
        }
        for(String l:ts){
            System.out.println(l);
        }
    }*/

// For integer array

    public static void main(String args[]){

        int[] num={100,45,1,78,98,56,44,78,100,98};
        boolean flag=false;
        TreeSet<Integer> ts = new TreeSet<>(); //Tree Set / Set never accepts duplicates and since it is sorted set, it displays in sorted order.
        for(Integer l:num){
            ts.add(l);
        }
        for(Integer l:ts){
            System.out.println(l);
        }
    }
}