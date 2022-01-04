package codingProgramsForInterview;

import java.util.Collections;
import java.util.HashMap;
import java.util.Scanner;

public class PrintCharacterHavingLargestOccurence {

    public static void main(String args[]){

        System.out.print("Please enter any string: \n");
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(secondMaxOccurences(str));

    }

    private static int secondMaxOccurences(String str) {

        char[] characters = str.toCharArray();

        HashMap<Character, Integer> occurences = new HashMap<>();
        for (int i = 0; i < characters.length; i++) {
            if (!occurences.containsKey(characters[i])) {
                occurences.put(characters[i], 1);
            } else {
                occurences.put(characters[i], (occurences.get(characters[i]) + 1));
            }
        }

        char maxChar = '_';
        int maxValue = 0;

        for (Character key : occurences.keySet()) {
            if (occurences.get(key) > maxValue) {
                maxChar = key;
                maxValue = occurences.get(key);
            }
        }
        System.out.print(maxChar + " --> ");
        return maxValue;
    }
}
