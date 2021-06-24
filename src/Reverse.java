//https://www.geeksforgeeks.org/reverse-a-linked-list/
public class Reverse {

	static Node head;
	
	Node reverse(Node head) {
		Node prev = null;
		Node current = head;
		Node next;
		while(current != null) {
			next = current.next;
			current.next = prev;
			prev = current;
			current = next;
		}
		head = prev;
		return head;
	}
	
	void add(int data) {  
		Node toAdd = new Node(data);
		
		if(isEmpty() ) {   
			System.out.println("List is Empty");
			head = toAdd;
			return;
		}
		
		Node temp = head;
		while(temp.next != null) {
			temp = temp.next;
		}
		temp.next = toAdd;
		
	}
	
	void print() {   
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
		System.out.println();
		
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
		
		public Node(int data) { //constructor
			this.data = data;
			next = null;
		}
		
	public static void main(String[] args) {
		
		Reverse obj = new Reverse();
		obj.add(1);
		obj.add(2);
		obj.add(3);
		//obj.add(4);
		
		System.out.println("Input : ");
		obj.print();
		
		System.out.println("Output : ");
		head = obj.reverse(head);
		obj.print();

	}

}
}
