public class LinkedListDE {
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

    // Method to delete a node from the end of the linked list
    public void deleteFromEnd() {
        if (head == null || head.next == null) {
            head = null;
            return;
        }

        Node current = head;
        Node previous = null;

        while (current.next != null) {
            previous = current;
            current = current.next;
        }

        previous.next = null;
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
        LinkedListDE linkedList = new LinkedListDE();

        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);
        linkedList.insert(4);

        System.out.println("Original linked list:");
        linkedList.display();

        linkedList.deleteFromEnd();

        System.out.println("After deleting the last node:");
        linkedList.display();
    }
}


// output will be:-
// Original linked list:
// 1 -> 2 -> 3 -> 4 -> null
// After deleting the last node:
// 1 -> 2 -> 3 -> null
