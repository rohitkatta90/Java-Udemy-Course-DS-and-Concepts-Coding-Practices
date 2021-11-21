package patterns;

public class Pattern4 {
    public static void main(String args[]){
        int i=1;
        int j=1;
        int count=0;
        for(i=1;i<=5;i++){
            for(j=1;j<=5;j++){
                ++count;
                //System.out.print(count+" "); // This statement prints correct output but spaces are not balanced.
                System.out.format("%02d ",count); //important step to prefix 0 before each single digit and also adjust the spaces correctly
            }
            System.out.println("");
        }
    }
}
