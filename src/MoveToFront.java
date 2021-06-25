//https://www.geeksforgeeks.org/move-last-element-to-front-of-a-given-linked-list/
public class MoveToFront {
	
	static Node head;
	
	void move() {
		if(isEmpty()) {
			System.out.println("List is Empty");
		}
		Node sec = null;
		Node last = head;
		while(last.next != null) {  //traverse till end
			sec = last;   //store value of last to sec last
			last = last.next;  
		}
		sec.next = null;
		last.next = head;
		head = last;
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
		MoveToFront obj = new MoveToFront();
		obj.add(1);
		obj.add(2);
		obj.add(3);
		obj.add(4);
		obj.add(5);
		
		System.out.println("Input : ");
		obj.print();
		
		System.out.println("Output : ");
		obj.move();
		obj.print();
	}

}
	
}
