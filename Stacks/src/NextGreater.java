//https://practice.geeksforgeeks.org/problems/next-larger-element-1587115620/1
import java.util.Stack;
public class NextGreater {

	public static void main(String[] args) {
		
		int arr[] = {1,3,2,4};
		int i = 0;
		int n = arr.length;
		Stack s = new Stack();
		int top = -1;
		int el , next;
		
		s.push(arr[0]);
		for(i =1;i<n;i++) {
			next = arr[i];
			if(s.isEmpty() == false) {
				el = (int) s.pop();
				while(el < next) {
					System.out.print(el+" ");
					if(s.isEmpty() == true)
						break;
					el = (int) s.pop();
				}
				
				if(el > next)
					s.push(el);
			}
			
			s.push(next);
		}
		
		while(s.isEmpty() == false) {
			el = (int) s.pop();
			next = -1;
			System.out.print(next+" ");
		}

	}

}
