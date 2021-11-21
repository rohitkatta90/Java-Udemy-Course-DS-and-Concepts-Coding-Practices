package arraysPractice;

public class OneDArraysDeclaration {

    public static void main (String args[]){

        int A[] = new int[5];
        int A1[] = {1,2,3,4,5};
        A[0]=1;
        A[1]=2;
        A[2]=3;
        A[3]=4;
        A[4]=5;

        System.out.println("*** Printing Array A ***");
        System.out.println("A length: "+A.length);
        for(int i =0; i<5;i++){
            System.out.println(A[i]);
        }

        System.out.println("*** Printing Array A1 ***");
        System.out.println("A1 length: "+A1.length);
        for(int i =0; i<5;i++){
            System.out.println(A1[i]);
        }

    }
}
