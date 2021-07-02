//https://practice.geeksforgeeks.org/problems/parenthesis-checker2744/1
import java.util.*;

public class BalancedParanthesis {

    public static void main(String args[]) {
    	String s = "{([])}";
    	boolean res;
        res = check(s);
        if(res == true)
        	System.out.println("Balanced Parenthesis");
        else
        	System.out.println("Not Balanced Parenthesis");
    }

    public static boolean check(String s) {
        Stack<Character> st  = new Stack<Character>();
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(c == '[' || c == '(' || c == '{' ) {     
                st.push(c);
            } 
            else if(c == ']') {
                if(st.pop() != '[') {
                    return false;
                }
            } 
            else if(c == ')') {
                if(st.pop() != '(') {
                    return false;
                }           
            } 
            else if(c == '}') {
                if(st.pop() != '{') {
                    return false;
                }
            }

        }
        return st.empty();
    }
}
