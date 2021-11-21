package codingProgramsForInterview;


// This program has both, bruteforce and the optimized way of solving the problem.

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PairsFromArrayWhoSumToGivenNumberInUnSortedArray {

    public static int[] bruteForceApproach(int A[], int n){

        for(int i=0;i<A.length;i++){
            for(int j=i+1;j<A.length;j++){
                if(A[i]==(n-A[j])){
                    return new int[]{A[i],A[j]};
                }
            }
        }
        throw new IllegalArgumentException("Pair not found");
    }

    public static int[] twoSum(int A[], int n){

        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<A.length-1;i++){
            map.put(A[i],i);
        }

        for(int i=0;i<A.length-1;i++){
            int numToFind = (n - A[i]);
            if(map.containsKey(numToFind) && map.get(numToFind)!=i){
                return new int[]{i, map.get(numToFind)};

            }
        }

        throw new IllegalArgumentException("Pair not found");
    }


    public static void main(String args[]){
        int A[] = {2,7,11,12,13,14,15};
        int target=27;

        //int A[] =  {1,0,3,5,2,3,6};
        //int target=6;

       /* System.out.print("Brute Force way-1 of printing is: ");
        int pair[] = PairsFromArrayWhoSumToGivenNumberInUnSortedArray.bruteForceApproach(A,target);
        for(int i=0;i<pair.length-1;i++){
            System.out.println("["+pair[i]+","+pair[i+1]+"]");
        }*/
        System.out.println("Using Brute Force way-1 of printing is: "+Arrays.toString(bruteForceApproach(A,target)));
        System.out.println("Using optimized way: "+ Arrays.toString(twoSum(A,target)));
    }
}
