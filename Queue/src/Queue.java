//geeksforgeeks.org/queue-set-1introduction-and-array-implementation/
public class Queue {

	int front,rear = 0;
	int size = 5;
	int queue[] = new int[size];
	
	void enqueue(int data) {
		if(rear == size) {
			System.out.println("Overflow");
		}
		else {
			queue[rear] = data; 
			rear++;
		}
	}
	
	void dequeue() {
		if(front == rear) {
			System.out.println("Underflow");
		}
		else {
			queue[front] = 0;
			front++;
		}
	}
	
	void show() {
		for(int i=front;i<size;i++) {
			System.out.print(queue[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {

		Queue obj = new Queue();
		obj.enqueue(10);
		obj.enqueue(20);
		obj.enqueue(30);
		obj.enqueue(40);
		obj.enqueue(50);
		obj.show();
		obj.dequeue();
		obj.show();
	}

}
