public class LinkedListIM {
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

    // Method to insert a new node at the specified position
    public void insertAtMiddle(int data, int position) {
        Node newNode = new Node(data);

        if (position == 1) {
            newNode.next = head;
            head = newNode;
        } else {
            Node previous = head;
            int count = 1;

            while (count < position - 1 && previous.next != null) {
                previous = previous.next;
                count++;
            }

            newNode.next = previous.next;
            previous.next = newNode;
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
        LinkedListIM linkedList = new LinkedListIM();

        linkedList.insertAtMiddle(3, 1);
        linkedList.insertAtMiddle(2, 2);
        linkedList.insertAtMiddle(4, 3);

        linkedList.display();
    }
}
