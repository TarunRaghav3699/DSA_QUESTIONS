public class LinkedListDM {
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

    // Method to delete a node from the middle of the linked list
    public void deleteFromMiddle(int position) {
        if (position <= 0 || head == null) {
            return;
        }

        if (position == 1) {
            head = head.next;
            return;
        }

        Node previous = null;
        Node current = head;
        int count = 1;

        while (current != null && count < position) {
            previous = current;
            current = current.next;
            count++;
        }

        if (current != null) {
            previous.next = current.next;
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
        LinkedListDM linkedList = new LinkedListDM();

        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(3);
        linkedList.insert(4);

        System.out.println("Original linked list:");
        linkedList.display();

        int positionToDelete = 2;
        linkedList.deleteFromMiddle(positionToDelete);

        System.out.println("After deleting node at position " + positionToDelete + ":");
        linkedList.display();
    }
}
