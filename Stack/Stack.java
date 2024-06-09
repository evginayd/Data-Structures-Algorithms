package Stack;

import java.util.Stack;

public class Stack {

	public static void main(String[] args) {
		
        Stack<Integer> stack = new Stack<Integer>();
        push(stack);
        pop(stack);
        push(stack);
        peek(stack);
        search(stack, 2);
        search(stack, 6);    
        
	}
	static void push(Stack<Integer> stack) 
	{
		for(int i = 0; i < 5; i++) 
		{
			stack.push(i);
		}
	}
	
	static void pop(Stack<Integer> stack) 
	{
		System.out.println("Pop operation: ");
		for(int i = 0; i < 5; i++) 
		{
			Integer y = (Integer) stack.pop();
			System.out.println(y);
			
		}
	}
	
	static void peek(Stack<Integer> stack) 
	{
		Integer element = (Integer) stack.peek();
		System.out.println("Element on stack top: " + element);
	}
	
	static void search(Stack<Integer> stack, int element) 
	{
		Integer index = (Integer) stack.search(element);
		
		if(index == -1) 
		{
			System.out.println("Element not found");
		}
		else 
		{
			System.out.println("Element is found at " + index + "th position");
		}
	}
}
