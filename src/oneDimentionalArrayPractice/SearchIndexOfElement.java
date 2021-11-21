package oneDimentionalArrayPractice;

import java.util.Scanner;

public class SearchIndexOfElement {

    public static void main(String args[]){
        int A[] = {1,2,3,4,5,6,7,8,9,10,45,55,66};

        System.out.println("Please enter any number: ");
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        //boolean flag;
        for(int i=0;i<A.length;i++){
            if(A[i]==number){
                System.out.println("Index is: "+i);
                System.exit(0);
            }
        }
        System.out.println("Not Found");
    }
}
