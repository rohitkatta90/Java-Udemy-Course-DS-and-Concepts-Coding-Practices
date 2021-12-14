package codingProgramsForInterview;

import java.util.HashSet;

public class FindDuplicateElementsInArray {

    // APPROACH -1

 /*   public static void main(String args[]){
        String arr[]={"Java1","C","C++","Java","Python","C1"};
        boolean flag=false;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]+" ");
                    flag=true;
                }
            }
        }
        if(flag==false){
            System.out.println("No duplicate elements found");
        }
    } */

// APPROACH -2

    public static void main(String args[]){

        String arr[]={"Java","C","C++","Java","Python","C"};
        boolean flag=false;
        HashSet<String> hs = new HashSet<>();
        for(String l:arr){
            if(!hs.add(l)){
                System.out.println(l);
                flag=true;
            }
        }
        if(flag==false){
            System.out.println("No duplicate elements found");
        }
    }

}
