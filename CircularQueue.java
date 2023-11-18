public class CircularQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;

    public CircularQueue(int capacity) {
        size = capacity;
        queue = new int[size];
        front = rear = -1;
    }

    public boolean isFull() {
        return (front == 0 && rear == size - 1) || (rear + 1 == front);
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue.");
        } else {
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            queue[rear] = item;
            System.out.println(item + " enqueued to the queue.");
        }
    }

    public void dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue.");
        } else {
            int removedItem = queue[front];
            if (front == rear) {
                front = rear = -1;
            } else {
                front = (front + 1) % size;
            }
            System.out.println(removedItem + " dequeued from the queue.");
        }
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        } else {
            return queue[front];
        }
    }

    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(5);

        cq.enqueue(1);
        cq.enqueue(2);
        cq.enqueue(3);
        cq.enqueue(4);
        cq.enqueue(5);

        cq.dequeue();
        cq.enqueue(6);
        cq.dequeue();

        System.out.println("Front element is: " + cq.peek());
    }
}


// output will be:-

// 1 enqueued to the queue.
// 2 enqueued to the queue.
// 3 enqueued to the queue.
// 4 enqueued to the queue.
// 5 enqueued to the queue.
// 1 dequeued from the queue.
// 6 enqueued to the queue.
// 2 dequeued from the queue.
// Front element is: 3