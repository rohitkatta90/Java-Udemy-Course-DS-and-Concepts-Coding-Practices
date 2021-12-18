package abstractClass;

import java.util.HashSet;

public class Test {

    static String myString = "aabbbcccccccccddddddd";
    static int longestNumOfChar = 0;
    static char longestChar = '\0';

    public static void main(String args[]) {

        int currentNumberofOccurences = 1;
        if(myString.length() == 0){
            System.out.println("Invalid String...");
        }
        else{

            for(int i = 0; i < myString.length()-1 ; i++){
                char current = myString.charAt(i);
                char next = myString.charAt(i+1);

                if(current == next){
                    currentNumberofOccurences+=1;


                }else if(currentNumberofOccurences > longestNumOfChar){
                    longestNumOfChar = currentNumberofOccurences;
                    longestChar = current;
                }else{
                    currentNumberofOccurences=1;
                }
                if(currentNumberofOccurences > longestNumOfChar){
                    longestNumOfChar = currentNumberofOccurences;
                    longestChar = current;
                }
            }

            System.out.println(longestChar + "-->"+longestNumOfChar);
        }
    }


}


