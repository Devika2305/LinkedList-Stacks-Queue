//https://practice.geeksforgeeks.org/problems/reverse-a-doubly-linked-list/1
public class ReverseDoubly {

	static Node head;
	int count = 0;
	
	Node reverse(Node head) {
		if(head == null) {
			System.out.println("Linked List is Empty! Nothing to reverse.");
			return null;
		}
		Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;
        return head;
	}
	
	
	void deleteAtMid(int pos) {    //delete from a given position
		if(head == null) {
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
	
	void deleteAtEnd() {  //delete from beginning
		if(head == null) {
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
	
	
	void deleteAtBeg() {  //delete from beginning
		if(head == null) {
			System.out.println("List is Empty");
		}
		else {
			head = head.next;
			count--;
		}
	}
	
	void insertAtMid(int data , int pos) {   // insert element at a given index
		if(pos == 0) {
			insertAtBeg(data);
		}
		else if(pos == count) {
			insertAtEnd(data);
		}
		else if(pos > 0 && pos < count) {
			Node temp = head;
			int i =0;
			while(i < pos-1) {
				temp = temp.next;
				i++;
			}
			Node toAdd = new Node(data);
			temp.next.prev = toAdd;
			toAdd.next = temp.next;
			toAdd.prev = temp;
			temp.next = toAdd;
			count++;
		}
		else {
			System.out.println("Invalid Position");
		}	
	}
	
	
	
	void insertAtBeg(int data) {
		Node toAdd = new Node(data);		
		head = toAdd;
		count++;
	}
	
	private void insertAtEnd(int data) {
		Node toAdd=new Node(data);
		if(head == null) {
			System.out.println("List is Empty");
			head = toAdd;
			count++;
		}
	
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=toAdd;
		count++;
	}
	
	
	void print() {
		if(head==null) {
			System.out.println("Linked List is Empty! Nothing to print.");
		}
		else {
			Node temp=head;
			System.out.println("Nodes in Linked List:");
			while(temp!=null) {
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			System.out.println();
			
		}
	}
	
	static class Node{
		int data;
		Node next;
		Node prev;
		
		public Node(int data) {
			this.data = data;
			next = null;
			prev = null;
		}
	}
	
	public static void main(String[] args) {

		ReverseDoubly obj=new ReverseDoubly();
		obj.insertAtBeg(23);
		obj.insertAtEnd(24);
		obj.insertAtEnd(40);
		obj.insertAtMid(1, 1);
		obj.insertAtMid(2, 2);
		obj.insertAtMid(3, 3);
		obj.insertAtMid(4, 4);
		obj.print();
		head = obj.reverse(head);
		System.out.println("After reversing ");
		obj.print();
		
		
		
	}

}
