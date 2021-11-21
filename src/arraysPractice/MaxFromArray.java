package arraysPractice;

public class MaxFromArray {

    public static int maxNum(int[] A){
        int number=A[0];
        for(int i=1;i<A.length-1;i++){
            if(number<A[i]){
                number=A[i];
            }
        }
        return number;
    }

    public static void main(String args[]){
        int A[] = {78,45,34,200,99,65};
        System.out.println(maxNum(A));
    }
}
