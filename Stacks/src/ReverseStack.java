//https://www.geeksforgeeks.org/reverse-a-stack-using-recursion/
import java.util.*;
public class ReverseStack {

	static Stack<Integer> st = new Stack<Integer>();

	static void insertAtBottom(int x) {
		if(st.isEmpty())
			st.push(x);

		else {
			int a = st.peek();
			st.pop();
			insertAtBottom(x);
			st.push(a);
		}
	}
	
	static void reverse(){
		if(st.size() > 0) {
			
			int x =  st.peek();
			st.pop();
			reverse();
			insertAtBottom(x);
		}
	}
	
	public static void main(String[] args) {

		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		
		System.out.println("Original Stack ");
		System.out.println(st);
		
		reverse();
		System.out.println("Reversed Stack ");
		System.out.println(st);
	}

}
