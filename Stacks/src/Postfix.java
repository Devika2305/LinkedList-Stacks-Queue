//https://practice.geeksforgeeks.org/problems/evaluation-of-postfix-expression1735/1

import java.util.Stack;
public class Postfix {

	public static void main(String[] args) {

		Stack <Integer> stack = new Stack();
		String s = "231*+9-";
		
		for(int i=0;i<s.length();i++) {
			char ch  = s.charAt(i);
			if(Character.isDigit(ch))
				stack.push(ch-'0');
			else {
				int a = stack.pop();
				int b = stack.pop();
				switch(ch) {
				case '+':
					stack.push(a+b);
					break;
				
				case '-':
					stack.push(b-a);
					break;
			
				case '*':
					stack.push(a*b);
					break;
				
				case '/':
					stack.push(b/a);
					break;
				
				}		
			}
		}
		System.out.println("Result = "+stack.pop());
	}
}			
				
