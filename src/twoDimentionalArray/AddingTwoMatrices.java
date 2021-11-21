package twoDimentionalArray;

//Matrices can be added or subtracted only if the order of the matrices are same
//eg: 3x3, 5x5, 8x8

// 2x4, 5x6 arrays cannot be added or subtracted

public class AddingTwoMatrices {

    public static void main(String args[]){

        int A[][] = {{1,5,2},{6,3,5},{7,1,3}};
        int B[][] = {{2,1,5},{1,1,1},{2,4,2}};
        int C[][] = new int[3][3];

        for(int i = 0;i<3;i++){
            for(int j =0;j<3;j++){
                C[i][j] = A[i][j] + B [i][j];
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
