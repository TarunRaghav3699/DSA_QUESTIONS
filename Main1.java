class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList2 {
    Node head;

    public LinkedList2() {
        this.head = null;
    }

    public void append(int data){
        Node newNode = new Node(data);
            if (head == null){
                head = newNode;
                return;
            }
            Node current = head;
            while (current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }

    public void display(){
        Node current = head;
        while (current != null){
            System.out.println(current.data + "->");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class Main1 {
    public static void main(String[] args){
        LinkedList2 myList = new LinkedList2();

        myList.append(1);
        myList.append(2);
        myList.append(3);

        myList.display();
    }
}