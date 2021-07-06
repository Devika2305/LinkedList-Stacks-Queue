//https://practice.geeksforgeeks.org/problems/sort-a-stack/1
import java.util.Stack;

public class Sort {

	private static void sort(Stack<Integer> st) {

		if(!st.isEmpty()) {
			int temp = st.pop();
			sort(st);
			insert(st,temp);
		}
	}
	
	private static void insert(Stack<Integer> st, int temp) {

		if(st.isEmpty() ) {
			st.push(temp);
			return;
		}
		if( temp > st.peek()) {
			st.push(temp);
			return;
		}
		int temp1 =  st.pop();
		insert(st,temp);
		st.push(temp1);
		
	}

	public static void main(String[] args) {

		Stack<Integer> st = new Stack<Integer>();
		st.push(11);
		st.push(2);
		st.push(32);
		st.push(3);
		st.push(41);
		System.out.println("Original Stack");
		System.out.print(st);
		System.out.println();
		sort(st);
		System.out.println("Sorted Stack");
		System.out.print(st);
		
	}
}
