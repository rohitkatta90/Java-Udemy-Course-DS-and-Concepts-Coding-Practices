package twoDimentionalArray;

//Two Matrices can be multiplied only if the number of columns of first matrix
//should be equal to the number of rows of second matrix
// valid eg: A=3x3 and B=3x3 , A=2x4 and B=4x3
//invalid eg: A=3x2 and B=3x4

//Eg: is C00 =  A00xB00 + A01xB10 + A02xB20
// C01 = A00xB01 + A01xB11 + A02xB21
// C01 = A00xB02 + A01xB12 + A02xB22
// So here check the values of i and j for each of the C value and the value of k increments.

//Identity Matrix = B = {{1,0,0},{0,1,0},{0,0,1}}

// Any matrix multiplied by the indentity matrix is the same matrix.


public class MultiplyTwoMatrices {

    public static void main(String args[]){

        int A[][] = {{1,5,2},{6,3,5},{7,1,3}};
        int B[][] = {{1,0,0},{0,1,0},{0,0,1}};
        //int B[][] = {{2,1,5},{1,1,1},{2,4,2}};
        int C[][] = new int[3][3];

        for(int i = 0;i<3;i++){
            for(int j =0;j<3;j++){
                C[i][j]=0;
                for(int k=0;k<3;k++) {
                    C[i][j] = C[i][j] + A[i][k] * B[k][j]; //This logic is important
                }
            }
        }

        // For loop for printing
        /*for(int i =0;i<C.length;i++){
            for(int j=0;j<C[i].length;j++) {
                System.out.print(C[i][j] + " ");
            }
            System.out.println("");
        }*/



        //For Each Loop

        for(int x[]:C){
            for(int y:x) {
                System.out.print(y + " ");
            }
            System.out.println("");
        }

    }
}
