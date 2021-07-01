//https://www.tutorialspoint.com/javaexamples/data_stack.htm
public class Stacks {
	int top =0;
	int n = 5;
	int arr[] = new int[n];
	public static void main(String[] args) {
		
		
		
		Stacks obj = new Stacks();
		obj.push(5);
		obj.push(6);
		obj.push(7);
		obj.pop();
		obj.push(1);
		obj.push(2);
		obj.pop();
		obj.show();
	}
	
	void push(int data) {
		if(top > n) {
			System.out.println("Stack Overflow");
		}
		else {
			arr[top] = data;
			top++;
		}
	}
	
	void pop() {
		int x;
		if(top < 0) {
			System.out.println("Stack Underflow");
		}
		else {
			x = arr[--top];
			//top--;
			System.out.println("Popped element : "+x);
		}
	}
	
	void show() {
		for(int i=0; i<=top;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
