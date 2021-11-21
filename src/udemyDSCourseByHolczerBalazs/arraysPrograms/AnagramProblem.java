package udemyDSCourseByHolczerBalazs.arraysPrograms;

import java.util.Arrays;

/*
"An anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once"

For example: restful and fluster are anagrams.

so here the word "restful" is called as the subject, and the word "fluster" is called as anagram.

 */
public class AnagramProblem {

    public boolean solve(char[] s1, char[] s2) {
        if (s1.length != s2.length) {
            return false;
        }
        // bottleneck because the time complexity is O(NlogN) running time.
        Arrays.sort(s1);
        Arrays.sort(s2);

        for(int i=0;i<s1.length;i++){
            if(s1[i]!=s2[i]){
                return false;
            }
        }
            return true;
    }
}