package udemyDSCourseByHolczerBalazs.strings;

/*
Important: Since we have used StringBuilder which deals with characters and is also mutable unlike Strings.
The complexity here is O(N) while if String class was used the complexity would have been O(N*N)
The space in Strings would have been doubled but in case of StringBuilder the space is also saved.
 */

public class ReverseStringWithStringBuilder {

    public String revertString(String str){

        StringBuilder sb = new StringBuilder();
        for(int index=str.length()-1;index>=0;index--){

            sb.append(str.charAt(index));
        }
        return sb.toString();
    }
}
