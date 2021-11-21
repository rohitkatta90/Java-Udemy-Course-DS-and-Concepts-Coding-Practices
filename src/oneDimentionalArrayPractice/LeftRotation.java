package oneDimentionalArrayPractice;

import java.util.Scanner;

public class LeftRotation {

    public static void main(String args[]){
        int A[] = {1,2,3,4,5,6,7,8,9,10,45,55,66};

        System.out.println("Array before rotation is");

        //boolean flag;
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println("");
        int temp;
        temp=A[0];
        for(int i=0;i<A.length-1;i++){
            A[i]=A[i+1];
        }
        //int length=A.length-1;
        A[A.length-1]=temp;
        System.out.println("Array after LEFT rotation is");
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println("");
    }
}
