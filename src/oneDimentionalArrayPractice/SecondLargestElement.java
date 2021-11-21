package oneDimentionalArrayPractice;

public class SecondLargestElement {

    public static void main(String args[]){

        int A[] = {1000,6,34,65,78,87,65,90,33,100,0};
        int firstLargest, secondLargest;
        firstLargest=secondLargest= A[0];

        for(int i=1;i<A.length;i++){
            if(A[i]>firstLargest){
                secondLargest=firstLargest;
                firstLargest=A[i];
            }else if(A[i]>secondLargest){
                secondLargest=A[i];
            }
        }
        System.out.println("The first largest number is: "+firstLargest);
        System.out.println("The second largest number is: "+secondLargest);
    }
}
