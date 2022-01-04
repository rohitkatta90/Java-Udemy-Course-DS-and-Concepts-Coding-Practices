package codingProgramsForInterview;

import java.util.Stack;

public class BalancedBracketsCheck {

    public static void main(String args[]){
        String str = "([}}])";
        System.out.println(isValid(str));
    }

    public static boolean isValid(String s) {
        if(s.length() % 2 != 0) return false;

        Stack<Character> st = new Stack<>();
        for(Character c : s.toCharArray()){
            if(c == '(' || c == '[' || c == '{'){
                st.push(c);
            }else if(c == ')' && !st.empty() && st.peek() == '('){
                st.pop();
            }else if(c == ']' && !st.empty() && st.peek() == '['){
                st.pop();
            }else if(c == '}' && !st.empty() && st.peek() == '{'){
                st.pop();
            }else{
                return false;
            }
        }
        return st.empty();
    }
}
