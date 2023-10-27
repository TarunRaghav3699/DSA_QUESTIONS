class Node {
    public int data;
    public Node left;
    public Node right;

    public Node(int val) {
        data = val;
        left = null;
        right = null;
    }
}

public class BinaryTree {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);

        // Printing the tree structure
        printTree(root);
    }

    public static void printTree(Node node) {
        if (node == null) {
            return;
        }

        // Print the data of the current node
        System.out.print(node.data + " ");
        if (node.left != null){
            System.out.println("Left: "+ node.left.data + " ");
        }
        if (node.right != null){
            System.out.println("Right: "+ node.right.data +" ");
        }
        System.out.println();

        // Recursive call for left and right subtrees
        printTree(node.left);
        printTree(node.right);
    }
}
