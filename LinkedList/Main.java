package linkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Adding elements to the list
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        // Display the list
        System.out.println("Linked list:");
        list.display();

        // Remove an element from the list
        list.remove(3);

        // Display the list again
        System.out.println("Linked list after removing element 3:");
        list.display();
    }
}

