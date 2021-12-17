package codingProgramsForInterview;

//https://5balloons.info/program-java-code-to-find-longest-character-sequence-in-a-random-string/

public class LongestContinuousCharSequenceInString {

    //static String myString = "aaaabbbbcccchhhhiiiiibbbbbbbbbccccccc";
    static String myString = "aabbbccccddddddd";
    static int largestSequence = 0;
    static char longestChar = '\0';

    public static void main(String args[]) {
        int currentSequence = 1;
        char current = '\0';
        char next = '\0';

        for (int i = 0; i < myString.length() - 1; i++) {
            current = myString.charAt(i);
            next = myString.charAt(i + 1);

            // If character's are in sequence , increase the counter
            if (current == next) {
                currentSequence += 1;
            } else {
                if (currentSequence > largestSequence) { // When sequence is
                    // completed, check if
                    // it is longest
                    largestSequence = currentSequence;
                    longestChar = current;
                }
                currentSequence = 1; // re-initialize counter
            }
        }
        /*if (currentSequence > largestSequence) { // Check if last string
            // sequence is longest
            largestSequence = currentSequence;
            longestChar = current;
        }*/

        System.out.println("Longest character sequence is of character "
                + longestChar + " and is " + largestSequence + " long");
    }

}
