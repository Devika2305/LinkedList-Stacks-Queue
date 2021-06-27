//https://leetcode.com/problems/middle-of-the-linked-list/
public class MiddleElement {

	Node head;
	int count = 0;
	
	void middle() {
		Node slow = head;
		Node fast = head;
		if(head != null) {
			while(fast!= null && fast.next != null) {
				fast = fast.next.next;
				slow = slow.next;
			}
			System.out.println("Middle element is "+slow.data);
		}
	}
	
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
		obj.add(20);
		obj.add(30);
		obj.add(40);
		obj.add(50);
		obj.add(60);
		obj.add(70);
		obj.print();
		obj.middle();
	}
}
