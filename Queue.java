package Queue;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue queue = new Queue(10);
		
		queue.enqueue(1);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.enqueue(4);
		queue.printQueue();
		
		System.out.println("Size: " + queue.size());
		System.out.println("Dequeue: " + queue.dequeue());
		System.out.println("Peek: " + queue.peek());
		System.out.println("Size: " + queue.size());
	}
}

class Queue
{
	int[] queue;
	int front;
	int size;
	int capacity;
	
	public Queue(int capacity) {
		super();
		this.capacity = capacity;
		this.queue = new int[capacity];
		this.front = 0;
		this.size = 0;
	}
	
	public void enqueue(int number) 
	{
		if(size == capacity) 
		{
			System.out.println("Queue is already full...");
			return;
		}
		queue[(front + size) % capacity] = number;
		size++;
	}
	
	public int dequeue() 
	{
		if(size == 0) 
		{
			System.out.println("Queue is empty...");
			return -1;
		}
		int item = queue[front];
		front = (front + 1) % capacity;
		size--;
		return item;
	}
	
	public int peek() 
	{
		if(size == 0) 
		{
			System.out.println("Queue is empty...");
			return -1;
		}
		return queue[front];	
	}
	
	public int size() 
	{
		return size;
	}
	
	public void printQueue() 
	{
		System.out.println("Queue: ");
		for(int i = 0; i <size; i++) 
		{
			System.out.print(queue[(front + i) % capacity]);
		}
		System.out.println();
		
	}
	
}
