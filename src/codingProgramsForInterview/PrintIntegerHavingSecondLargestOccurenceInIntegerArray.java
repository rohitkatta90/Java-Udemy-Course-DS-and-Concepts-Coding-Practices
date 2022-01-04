package codingProgramsForInterview;

import java.util.HashMap;
import java.util.Map;

public class PrintIntegerHavingSecondLargestOccurenceInIntegerArray {

    public static void main(String args[]){
        int array [] = {1,2,3,3,4,4,4,5,5,5,5,6};
      System.out.println(secondMaxOccurences(array));

    }

    private static int secondMaxOccurences(int[] array) {

        HashMap<Integer,Integer> occurences = new HashMap<>();
        for(int i = 0 ; i < array.length ; i++){
            if(!occurences.containsKey(array[i])){
                occurences.put(array[i],1);
            }else{
                occurences.put(array[i], (occurences.get(array[i]) + 1));
            }
        }

        int maxValue = 0;
        int secondMaxValue = 0;
        int maxInt = 0;
        int secondMaxInt = 0;

        for(Integer key : occurences.keySet()){
            if(occurences.get(key) > maxValue){
                secondMaxValue = maxValue;
                secondMaxInt = maxInt;
                maxValue = occurences.get(key);
                maxInt = key;

            }else if(occurences.get(key) > secondMaxValue){
                secondMaxValue = occurences.get(key);
                secondMaxInt = key;
            }

        }
        System.out.print(secondMaxInt +" --> ");
        return secondMaxValue;
    }
}
