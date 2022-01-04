package udemyDSCourseByHolczerBalazs.arraysPrograms;

import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/*
The problem is that we want to find duplicates in a T[] one-dimensional array of integers in O(N) running time
where the integer values are smaller than the length of the array - and we can not use negative values!

Approach 1: Brute force
where we can have 2 for loops and then then iterate and check for duplicates. Time complexity is 0(N*N) runnting time.

Approach 2: Using Hash Map
Traverse each item in array and then try to insert in Hashmap with value as the Key.
If we cannot insert the item then we have duplicates as Keys in HashMap can never be duplicate
Problem: Not in-place algorithm and hence uses extra memory.

Approach 3: Using Abs values method
With this approach we can achieve time coplexity of O(N) running time that is in-place algorithm.
Pre Condition: All values in array should be smaller than the array size.

 */
public class RepeatedIntegersInArrayProblem {

    public void absValueWay(int[] array){

        // this is why it is an O(N) running time algorithm
        for(int i=0;i<array.length;i++){

            //if this value is positive then we have to flip this
            if(array[(Math.abs(array[i]))]>0){
                array[(Math.abs(array[i]))] = -array[(Math.abs(array[i]))];
            }else{
                System.out.println(Math.abs(array[i])+" is a repetition");
            }
        }
    }

    public void bruteForce(int[] array){

        for(int i =0 ; i < array.length ; i++){
            for(int j = i+1 ; j < array.length ; j++){
                if(array[i] ==  array[j]){
                    System.out.println(array[i]+" is repeated");
                }
            }
        }

    }

    public void hashMapWay(int[] array) {

        HashMap<Integer, Integer> numbers_count = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            if (numbers_count.containsKey(array[i])) {
                numbers_count.put(array[i], numbers_count.get(array[i]) + 1);
            } else {
                numbers_count.put(array[i], 1);
            }
        }
        System.out.println(numbers_count.toString());
        for(Map.Entry<Integer, Integer> entry: numbers_count.entrySet()){

            if(entry.getValue() >= 2){
                System.out.print(entry.getKey()+ " is repeated");
            }

        }

    }

}
