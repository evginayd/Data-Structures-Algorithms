package StackwArray;

public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack(10);
        
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        
        System.out.println("The stack: ");
        stack.printStack();
        
        System.out.println("Size: " + stack.size());
        System.out.println("Pop: " + stack.pop());
        System.out.println("Peek: " + stack.peek());
        System.out.println("Size: " + stack.size());
    }
}

class Stack {
    int[] stack;
    int top;
    int capacity;
    
    public Stack(int capacity) {
        this.stack = new int[capacity];
        this.top = -1;
        this.capacity = capacity;
    }
    
    public void push(int number) {
        if (top == capacity - 1) {
            System.out.println("The stack is already full...");
            return;
        }
        stack[++top] = number;  // Increment top first, then assign
    }
    
    public int pop() {
        if (top == -1) {
            System.out.println("Stack is empty...");
            return -1;
        }
        return stack[top--]; //return the top first then decrement
    }
    
    public int peek() {
        if (top == -1) {
            System.out.println("Stack is empty...");
            return -1;
        }
        return stack[top];
    }
    
    public int size() {
        return top + 1;
    }
    
    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }
}
