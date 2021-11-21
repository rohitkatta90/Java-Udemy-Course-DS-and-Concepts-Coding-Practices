package twoDimentionalArray;

public class PrintTwoDimentionalArrayUsingForEachLoop {

    public static void main(String args[]){

        int A[][]= new int[5][5];

        int B[][] = {{11,22,33},{44,55,66},{77,88,99}};

        for(int[] x : B){
            for(int y : x){
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }
}
