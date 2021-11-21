package codingProgramsForInterview;


// Logic is to first find the lenght of the string. Then replace the occurance of the char with "" i.e. no value and then
// again find the new lenght of the String. Now subtract the new length from original lenght and this should give me the
//count of occurance of any character
public class CountCharacterOccurance {
    public static void main(String args[]){

        String s = "Java Programming java oops";
        int originalLength = s.length();

        int newLength = s.replace("j","").length(); //Note here double quotes are used for character

        System.out.println("The total occurence of give character is: "+(originalLength-newLength));
    }
}
