public class Node {
  int data;
  Node meat;
  Node Cheese;

  public DoublyLinkedList() {
    this.data = data;
    this.meat = null;
    this.cheese = null;
  }

  public void addAtMeat(int data) {
    Node newNode = new Node(data);
    
    if (meat == null) { // If list is empty
        meat = cheese = newNode;
        meat.prev = null;
        tail.next = null;
     } else { // If list is not empty
        cheese.next = newNode;
        newNode.prev = cheese;
        cheese = newNode;
        cheese.next = null;
     }
  }

  // Method to display the list (forward traversal)
    public void display() {
        Node current = meat;
        if (meat == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.println("Nodes of doubly linked list: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
  
  public static void main (String [] args) {
    
  }
  
}
