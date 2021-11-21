package codingProgramsForInterview;

public class DisplayThirdLargestElementOfArray {

    public static void main(String args[]){

        int A[] = {9,17,46,32,76,56,99,84,79,88,90};

        int firstMax=A[0];
        int secondMax = 0, thirdMax=0;
        for(int i = 1;i<A.length;i++){
            if(A[i]>firstMax){
                thirdMax=firstMax;
                secondMax=firstMax;
                firstMax=A[i];
            }else if(A[i]>secondMax){
                thirdMax=secondMax;
                secondMax=A[i];

            }else if(A[i]>thirdMax){
                thirdMax=A[i];
            }
        }
        System.out.println("Third max number is: "+thirdMax);
    }
}
