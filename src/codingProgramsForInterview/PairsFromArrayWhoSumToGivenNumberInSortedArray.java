package codingProgramsForInterview;

//Array given is sorted and have all distinct values.
//Sum is 9


public class PairsFromArrayWhoSumToGivenNumberInSortedArray {
    public static void main(String args[]){

        int A[] =  {1,2,3,4,5,6,7,8,9,10,11,12,13,14,14,15,16,17,18,19,20};
        //int A[] =  {1,0,3,5,2,3,6};
        int low=0;
        int high= A.length-1;
        int sum=25;

        while(low<high){
            if(A[low]+A[high]>sum){
                high--;
            }else if(A[low]+A[high]<sum){
                low++;
            }else if(A[low]+A[high]==sum){
                System.out.println("["+A[low]+","+A[high]+"]");
                low++;
                high--;
            }
        }

    }
}
