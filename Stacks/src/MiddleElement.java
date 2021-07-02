
//https://www.geeksforgeeks.org/design-a-stack-with-find-middle-operation/
public class MiddleElement {

	Node head = null;
	int count=0;
	
	void push(int data) {
		Node toAdd = new Node(data);
		toAdd.prev = null;
		toAdd.next = head;
		count++;
		
		//if(count == 1)
			//st.mid = toAdd;
		
	
//		Node temp=head;
//		while(temp.next!=null) {
//			temp=temp.next;
//		}
//		temp.next=toAdd;
//		count++;
	}
	
	static class Stack{
		Stack st = new Stack();
		Node head;
		Node mid;
		int count;
	}
	static class Node{
		Node prev;
		Node next;
		int data;
		
		Node(int data){
			prev = next = null;
			this.data = data;
		}
		
	}
	public static void main(String[] args) {

		Stack st = new Stack();
	
		MiddleElement obj = new MiddleElement();
	}

}
