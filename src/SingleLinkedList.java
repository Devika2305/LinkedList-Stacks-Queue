
public class SingleLinkedList {

	Node head;
	int count = 0;
	
	void insertAtMid(int data , int pos) {   // insert element at a given index
		if(pos == 0) {
			insertAtBeg(data);
		}
		else if(pos > 0 && pos < count) {
			Node temp = head;
			int i =0;
			while(i < pos-1) {
				temp = temp.next;
				i++;
			}
			Node toAdd = new Node(data);
			toAdd.next = temp.next;
			temp.next = toAdd;
			count++;
		}
		else {
			System.out.println("Invalid Position");
		}	
	}
	
	void insertAtBeg(int data) {   // insert element at beginning
		Node toAdd = new Node(data);
		toAdd.next = head;
		head = toAdd;
		count++;
		
	}
	
	void insertAtEnd(int data) {  // insert element at last
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

	void deleteAtBeg() {  //delete from beginning
		if(isEmpty()) {
			System.out.println("List is Empty");
		}
		else {
			head = head.next;
			count--;
		}
	}
	
	void deleteAtEnd() {      //delete from end
		if(isEmpty()) {
			System.out.println("List is Empty");
		}
		else {
			Node temp = head;
			while(temp.next.next != null) {
				temp = temp.next;
			}
			temp.next = null;
			count--;
		}
	}
	
	void deleteAtMid(int pos) {    //delete from a given position
		if(isEmpty()) {
			System.out.println("List is Empty");
		}
		else if(pos == 0) {
			deleteAtBeg();
		}
		else if(pos > 0 && pos < count) {
			Node temp = head;
			int i = 0;
			while(i < pos-1) {
				temp = temp.next;
				i++;
			}
			temp.next = temp.next.next;
			count--;
		}
		else {
			System.out.println("Invalid position");
		}
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
		
		SingleLinkedList myLL = new SingleLinkedList();
		
		myLL.insertAtEnd(10);
		myLL.insertAtEnd(20);
		myLL.insertAtBeg(50);
		myLL.insertAtMid(30, 2);
		myLL.deleteAtBeg();
		myLL.insertAtEnd(40);
		myLL.insertAtBeg(60);
		myLL.insertAtMid(70, 3);
		myLL.deleteAtEnd();
		myLL.print();
	}

}
