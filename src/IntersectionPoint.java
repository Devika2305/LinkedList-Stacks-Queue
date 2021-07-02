//https://practice.geeksforgeeks.org/problems/intersection-point-in-y-shapped-linked-lists/1
public class IntersectionPoint {

	static Node head1;
	static Node head2;
	
	// Diff in length algo
	int intersect(Node head1,Node head2){
		int l1 = length(head1);
		int l2 = length(head2);
		int diff;
		Node temp1 , temp2;      // temp1 stores head of longest list
		 if(l1>l2) {
			 diff = l1-l2;
			 temp1 = head1;
			 temp2 = head2;
		 }
		 else {
			 diff = l2-l1;
			 temp1 = head2;
			 temp2 = head1;
		 }
		 
		 while(diff-- != 0) {
			 temp1 = temp1.next;
			 if(temp1 == null)
				 return -1;
		 }
		 while(temp1 != null && temp2 != null) {
			 if(temp1 == temp2)
				 return temp1.data;
			 temp1 = temp1.next;
			 temp2 = temp2.next;
		 }
		return -1;
		
	}
	
	
	
	//Brute force
/*	int intersect(Node head1,Node head2) {
		int l1 = length(head1);
		int l2 = length(head2);
		Node temp1 = head1;

		for(int i = 0;i<l1;i++) {
			Node temp2 = head2;
			for(int j = 0;j<l2;j++) {
				
				if(temp1 == temp2) 
					return temp2.data;
				
				else 
					temp2 = temp2.next;
			}
			temp1 = temp1.next;
		}
		return 0;
	} 
*/	
	
	Node add(Node head , int data) {  
		Node toAdd = new Node(data);
		toAdd.next = head;
		head = toAdd;
		return head;
		
	}
	
	int length(Node node) {
		int length=0;
		while(node!=null) {
			length++;
			node=node.next;
		}
		return length;
	}
	
	void display(Node head) {
		if(head==null) {
			System.out.println("Linked List is Empty! Nothing to print.");
		}
		else {
			Node temp=head;
			System.out.println("Nodes in Linked List:");
			while(temp!=null) {
				System.out.print(temp.data+" -> ");
				temp=temp.next;
			}
			System.out.print("null");
			System.out.println();
			System.out.println("******************************************");
		}
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
		IntersectionPoint obj=new IntersectionPoint();
				
		head1 = obj.add(head1, 60);
		head1 = obj.add(head1, 50); 
		head1 = obj.add(head1, 40);
		head1 = obj.add(head1, 30); 
		head1 = obj.add(head1, 20);
		head1 = obj.add(head1, 10);
		obj.display(head1);
		head2 = obj.add(head2, 80);
		head2 = obj.add(head2, 70);
		head2.next.next = head1.next.next.next.next;
		obj.display(head2); 
		System.out.println("Intersection Node = "+obj.intersect(head1,head2));
	}

}
