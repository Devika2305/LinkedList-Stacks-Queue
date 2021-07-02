
public class CircularLinkedList {

	static Node head;
		
	void count(Node head){
		int c = 0;
		if(head == null)
			System.out.println("Lisst is empty");
		Node temp = head;
		while(temp != head) {
			c++;
			temp = temp.next;
		}
		System.out.println("Count = "+c);
	}
	
	void inserAtEnd(int data) {
		Node toAdd = new Node(data);
		if(head == null) {
			head = toAdd;
	}
		Node temp = head;
		while(temp.next != head) {
			temp = temp.next;
		}
		temp.next = toAdd;
		toAdd.next = head;
	}
	
	void insertAtBeg(int data) {
		Node toAdd = new Node(data);
		if(head == null) {
			head = toAdd;
		}
		Node temp = head;
		while(temp.next != head) {
			temp = temp.next;
			toAdd.next = head;
			head = toAdd;
		}
	}
	
	void display() {
		Node temp = head;
		while(temp.next != head) {
			System.out.println(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
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

		CircularLinkedList obj = new CircularLinkedList();
		obj.insertAtBeg(5);
		obj.inserAtEnd(10);
		obj.inserAtEnd(20);
		obj.insertAtBeg(30);
		obj.display();
		//obj.count(head);
		
	}

}
