//https://practice.geeksforgeeks.org/problems/detect-loop-in-linked-list/1
public class DetectLoop {

	static Node head = null;
	
	boolean detect(Node head) {
		Node fast = head;
		Node slow = head;
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			
			if(slow == fast)
				return true;
		}
		return false;
		
	}
	void add(int data) {  
		Node toAdd = new Node(data);
		
		if(head == null ) {   
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
	
	void display() {
		if(head == null)
			System.out.println("List is empty");
		else {
			Node temp = head;
			while(temp != null) {
				System.out.print(temp.data+" ");
				temp = temp.next;
			}
			System.out.println();
		}
	}
	
	private void insert_cycle() {
		//1->2->3->4->5->6->7->8->9  to   1->2->3->4->5->6->7->8->9    
		//                                         |______________|     
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=head.next.next.next;    //9.next=4
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

		DetectLoop obj=new DetectLoop();
		obj.add(9);
		obj.add(8);
		obj.add(7);
		obj.add(6);
		obj.add(5);
		obj.add(4);
		obj.add(3);
		obj.add(2);
		obj.add(1);
		obj.insert_cycle();
		System.out.println(obj.detect(head));
		obj.display();
	}

}
