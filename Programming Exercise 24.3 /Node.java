import java.util.ListIterator;

/**
 * Represents a node in a doubly linked list.
 */
class Node {
    int data; // int data: the value stored in the node.
    Node next; // Node next: reference to the next node.
    Node prev; // Node prev: reference to the previous node.
    
/**
 * The constructor initializes these fields. next and prev are set to null by default.
 */  
    public Node(int data) {
        this.data = data; 
        this.next = null;
        this.prev = null;
    }
}

/**
 * A basic implementation of a doubly linked list with functionality
 * to add nodes at the end and display the list.
 */

public class DoublyLinkedList {
    private Node head;
    private Node tail;

    public void addAtEnd(int data) { // addAtEnd(int data): Adds a new node with the given data at the end of the list.
        Node newNode = new Node(data);
        if (head == null) { // If the list is empty (head is null), the new node becomes both head and tail.
            head = tail = newNode;
        } else { // Otherwise, it is appended after the current tail, and then becomes the new tail.
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void display() { // display(): Iterates from head to tail, printing each node’s data.
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void displayReverse() { // displayReverse() Add backward traversal (from tail to head).
        Node current = tail;
        while (current != null) {
            System.out.print(current.data + " "); 
            current = current.prev;
        }
        System.out.println();
    }

    public void addAtFront(int data) { // addAtFront() Add node insertion at the front .
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addAtEnd(10);
        list.addAtEnd(20);
        list.addAtEnd(30);
        list.display();
    }
}
/**
 * A basic implementation of a doubly linked list with functionality
 * to add nodes at the end and display the list.
 */
