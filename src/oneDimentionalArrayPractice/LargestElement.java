package oneDimentionalArrayPractice;

public class LargestElement {

    public static void main(String args[]){

        int A[] = {2,5,6,8,23,45,280,65,90,100};
        int max = A[0];
        for(int i=1 ; i< A.length;i++){

            if(max<A[i]){
                max=A[i];
            }

        }
        System.out.println("The maximum value is: "+max);
    }
}
