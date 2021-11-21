package codingProgramsForInterview;

/* Given a string s, find the length of the longest substring without repeating characters.

        For example –

        Example 1:

        Input: “abcabcbb” Output: 3

        The output string is “abc”, with a length of 3.

        Example 2:

        Input: “bbbbb” Output: 1

        The longest substring in this example is “b”. Its length is 1.

        Example 3:

        Input: “pwwkew” Output: 3

        The answer is “wke”. Its length is 3.

*/


import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacter {

    public static int lengthOfLongestSubstring(String s) {

        int maxCount = 0;
        int i = 0;
        int j = 0;
        int strLen = s.length();

        //Declare set of characters
        Set<Character> st = new HashSet<>();

        //Traverse a string
        while(i < strLen && j < strLen) {

            //If it's a unique character add in a set
            if(!st.contains(s.charAt(j))) {
                st.add(s.charAt(j));
                j++;
                maxCount = Math.max(maxCount, j-i);
            } else {
                st.remove(s.charAt(i));
                i++;
            }
        }

        return maxCount;
    }

    public static void main(String[] args) {

        String str = "abcdabccbb";
        int len = lengthOfLongestSubstring(str);

        System.out.println(" Length " + len);
    }
}