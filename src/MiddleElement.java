//https://leetcode.com/problems/middle-of-the-linked-list/
public class MiddleElement {

	Node head;
	int count = 0;
	
	void add(int data) {  // insert element at last
		Node toAdd = new Node(data);
		
		if(isEmpty() ) {   //if list is empty
			System.out.println("List is Empty");
			head = toAdd;
			count++;
			return;
		}
		
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = toAdd;
		count++;	
		
	}
	
	void print() {   //Printing the linkedlist
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.data + " ");
			temp = temp.next;
		}
		System.out.println("Count = "+count);
	}
	
	boolean isEmpty() {    // to chk is list is empty or not
		if(head == null)
			return true;
		else
			return false;
	}

	
	static class Node{
		int data;
		Node next;
		public Node(int data) {
			this.data = data;
			next = null;
		}
	}
	
	
	
	public static void main(String[] args) {
		
		MiddleElement obj = new MiddleElement();
		
		obj.add(10);
		obj.print();
	}
}
