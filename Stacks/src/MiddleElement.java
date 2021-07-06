import java.util.Stack;

//https://www.geeksforgeeks.org/design-a-stack-with-find-middle-operation/
public class MiddleElement {

	private static int mid(Stack<Integer> st, int size) {

		if(size == 0) {
			
			return 0;
		}
		int k = (size/2)+1;
		int a = solve(st,k);
		return a;
	}
	
	private static int solve(Stack<Integer> st, int k) {

		if(k == 1) {
			return k;
		}
		int temp = st.peek();
		st.pop();
		solve(st,k-1);
		st.push(temp);
		return k;
		
	}

	public static void main(String[] args) {

		Stack<Integer> st = new Stack<Integer>();
		st.push(1);
		st.push(2);
		st.push(3);
		st.push(4);
		st.push(5);
		st.push(6);
		int size = st.size();
		System.out.println("Stack ");
		System.out.println(st);
		int middle = mid(st,size);
		System.out.println("Middle Element = "+middle);
		
	}	

}
