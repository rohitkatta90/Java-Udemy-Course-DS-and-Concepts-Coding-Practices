package twoDimentionalArray;

public class SortArrayOfStrings {

    public static void main(String args[]){

        String arr[]={"java","python","pascal","smalltalk","ada","basic"};

        java.util.Arrays.sort(arr);

        for(String str:arr){
            System.out.println(str);
        }
    }
}
