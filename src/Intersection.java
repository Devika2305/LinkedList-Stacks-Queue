//https://practice.geeksforgeeks.org/problems/intersection-of-two-sorted-linked-lists/1
import java.util.*;

public class Intersection {

	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		list1.add(10);
		list1.add(20);
		list1.add(40);
		list1.add(50);
		list2.add(15);
		list2.add(40);
		list2.add(10);
		
		for(int i : list2) {
			if(list1.contains(i)) {
				System.out.println(i+" ");
			}
		}
	}

}

// Using ArrayList
// Convert one linkedlist to Arraylist 
// Traverse through other list and chk for common elements from the arraylist
// Print the common elements


// Brute force   O(N^2)
// Traversing in both the linkedlists
// For each element of one linkedlist chk the element in other linked list
// If common element found, print the element