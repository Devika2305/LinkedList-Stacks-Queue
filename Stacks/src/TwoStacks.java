//https://practice.geeksforgeeks.org/problems/implement-two-stacks-in-an-array/1
public class TwoStacks {

	int arr[];    //, st1[], st2[];
	int size;
	int top1,top2;
	int i=0;
	
	public TwoStacks(int s) {
		size= s;
		arr = new int[size];
		top1 = -1;
		top2 = size;
	}
	
	
	void push1(int data) {
		if(top1 < top2-1) {
			top1++;
			arr[top1] = data;
		}
		else {
			System.out.println("Stack Overflow");
		}
	}
	
	public int pop1() {
		if(top1 >= 0) {
			int x = arr[top1];
			top1--;
			return x;
		}
		
		return -1;
	}
	
	void push2(int data) {
		if(top1 < top2-1) {
			top2--;
			arr[top2] = data;
		}
		else {
			System.out.println("Stack Overflow");
		}
	}
	
	public int pop2() {
		if(top2 < size) {
			int x = arr[top2];
			top2++;
			return x;
		}
		
	    return -1;
	}
	
	void show() {
		for(int j : arr) {
			System.out.print(j+" ");
		}
	}
	
	public static void main(String[] args) {
		
		TwoStacks ts = new TwoStacks(5);
		ts.push1(2);
	    ts.push1(3);
	    ts.push2(4);
	    System.out.print(ts.pop1()+" ");
	    System.out.print(ts.pop2()+" ");
	    System.out.print(ts.pop2());
	    
	}
}
