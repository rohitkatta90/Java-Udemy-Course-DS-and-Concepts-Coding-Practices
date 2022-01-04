package codingProgramsForInterview;

import java.util.HashMap;

public class FindNonDuplicateElementFromIntegerArray {

    public static void main(String args[]){
        int array [] = {2,2,3,3,4,5,5,6,6};
        System.out.println(XORWay(array));
        System.out.println(HashMapWay(array));

    }

    private static int HashMapWay(int[] array) {

        HashMap<Integer,Integer> occurences = new HashMap<>();
        for(int i = 0 ; i < array.length ; i++){
            if(!occurences.containsKey(array[i])){
                occurences.put(array[i],1);
            }else{
                occurences.put(array[i], (occurences.get(array[i]) + 1));
            }
        }

        for(Integer key : occurences.keySet()){
            if(occurences.get(key) == 1) {
                return key;
            }
        }
        return -1;
    }

    private static int XORWay(int[] array) {
        int ans = 0;
        for(int i = 0 ; i < array.length ; i++){
            ans = ans^array[i];
        }
        return ans;
    }
}
