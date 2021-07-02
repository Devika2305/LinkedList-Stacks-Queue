//https://practice.geeksforgeeks.org/problems/reverse-a-string-using-stack/1
import java.util.*;
public class ReverseString {

	void show(int size, Stack arr) {
		System.out.println("Original String ");
		for(int i=0; i<size;i++) {
			System.out.print(arr.get(i)+" ");
		}
		System.out.println();
	}
	
	void reverse(int size, Stack arr) {
		System.out.println("Reversed String");
		for(int i=size-1; i>=0;i--) {
			System.out.print(arr.get(i)+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {

		ReverseString obj = new ReverseString();
		Stack st = new Stack();
		String str = "GeeksforGeeks";
		
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			st.push(ch);
		}
		obj.show(st.size(),st);
		obj.reverse(st.size(),st);
	}

}
