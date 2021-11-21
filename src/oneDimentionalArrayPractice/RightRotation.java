package oneDimentionalArrayPractice;

public class RightRotation {

    public static void main(String args[]){
        int A[] = {1,2,3,4,5,6,7,8,9,10,45,55,66};

        System.out.println("Array before rotation is");

        //boolean flag;
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println("");
        int temp;
        temp=A[A.length-1];
        for(int j=1;j<A.length;j++){
            A[j]=A[j+1];
        }
        //int length=A.length-1;
        A[0]=temp;
        System.out.println("Array after RIGHT rotation is");
        for(int i=0;i<A.length;i++){
            System.out.print(A[i]+" ");
        }
        System.out.println("");
    }
}
