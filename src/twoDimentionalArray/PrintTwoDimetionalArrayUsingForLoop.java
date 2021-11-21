package twoDimentionalArray;

public class PrintTwoDimetionalArrayUsingForLoop {

    public static void main(String args[]){

        int B[][]={{1,3,7},{6,2,9},{6,3,1}};

        for(int i=0;i<B.length;i++){
            for(int j=0;j<B[0].length;j++){
                System.out.print(B[i][j]+" ");
            }
            System.out.println();
        }
    }
}
