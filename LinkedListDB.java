public class LinkedListDB {
    Node head;

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    // Method to insert a new node at the end of the linked list
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Method to delete the first node from the linked list
    public void deleteAtBeginning() {
        if (head != null) {
            head = head.next;
        }
    }

    // Method to display the linked list
    public void display() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedListDB linkedList = new LinkedListDB();
        // Firstly insert the elements by these methods and then delete those
        linkedList.insert(3);
        linkedList.insert(2);
        linkedList.insert(1);

        linkedList.display();

        linkedList.deleteAtBeginning();

        System.out.println("After deleting the first node:");
        linkedList.display();
    }
}
