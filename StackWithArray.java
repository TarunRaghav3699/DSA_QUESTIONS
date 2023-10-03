public class StackUsingArray {
    private int maxSize; // Maximum size of the stack
    private int top;     // Index of the top element
    private int[] stackArray; // Array to store stack elements

    // Constructor to initialize the stack
    public StackUsingArray(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1; // Initialize top to -1 as the stack is empty
    }

    // Method to push an element onto the stack
    public void push(int value) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push " + value);
        } else {
            stackArray[++top] = value;
            System.out.println("Pushed " + value + " onto the stack");
        }
    }

    // Method to pop (remove) the top element from the stack
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop.");
            return -1; // Return -1 to indicate an empty stack
        } else {
            int poppedValue = stackArray[top--];
            return poppedValue;
        }
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Method to check if the stack is full
    public boolean isFull() {
        return top == maxSize - 1;
    }

    public static void StackWithArray(String[] args) {
        StackUsingArray stack = new StackUsingArray(5);

        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("Popped: " + stack.pop());
        System.out.println("Popped: " + stack.pop());

        stack.push(4);
        stack.push(5);

        System.out.println("Stack is empty: " + stack.isEmpty());
        System.out.println("Stack is full: " + stack.isFull());
    }
}

