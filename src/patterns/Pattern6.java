package patterns;

public class Pattern6 {
    public static void main(String args[]){
        int i=1;
        int j=1;
        int count=0;
        for(i=1;i<=5;i++){
            for(j=1;j<=i;j++){
                ++count;
                //System.out.print(count+" "); //This is also a correct step. Uncomment and check the output
                //System.out.format("%02d ",count);// important step to note
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
