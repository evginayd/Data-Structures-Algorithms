package StackwLinkedList;

public class StackwLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stack = new Stack();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		
		System.out.println("Size: " + stack.size());
		System.out.println("Pop: " + stack.pop());
		System.out.println("Peek: " + stack.peek());
		System.out.println("Size: " + stack.size());
	}
}

class Node
{
	int data;
	Node next;
	Node(int data)
	{
		this.data = data;
		this.next = null;
	}
}

class Stack
{
	Node head;
	int size;
	
	public Stack() {
		this.head = null;
		this.size = 0;
	}
	
	public void push(int value) 
	{
		Node newNode = new Node(value);
		if(head != null) 
		{
			newNode.next = head;
		}
		head = newNode;
		size++;
	}
	
	public int pop() 
	{
		if(size == 0) 
		{
			return -1;
		}
		int pop = head.data;
		head = head.next;
		size--;
		return pop;
	}
	
	public int peek() 
	{
		if(size == 0) 
		{
			return -1;
		}
		return head.data;
	}
	
	public int size() 
	{
		return size;
	}
}
