//https://www.geeksforgeeks.org/circular-queue-set-1-introduction-array-implementation/
public class CircularQueue {

	int front,rear = 0;
	int size = 5;
	int count = 0;
	int Cqueue[] = new int[size];
	
	void enqueue(int data) {
		if(count == size) {
			System.out.println("Overflow");
		}
		else {
			Cqueue[rear] = data; 
			rear = (rear+1)%size;
					count = count+1;
		}
	}
	
	void dequeue() {
		if(count == 0) {
			System.out.println("Underflow");
		}
		else {
			Cqueue[front] = 0;
			front = (front + 1)%size;
			count = count - 1;
		}
	}
	
	void show() {
		for(int i=0;i<size;i++) {
			System.out.print(Cqueue[i]+" ");
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
