class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class BinarySearchTree {
    TreeNode root;

    public BinarySearchTree() {
        root = null;
    }

    // Insert a node
    public void insert(int data) {
        root = insertRec(root, data);
    }

    private TreeNode insertRec(TreeNode root, int data) {
        if (root == null) {
            root = new TreeNode(data);
            return root;
        }

        if (data < root.data)
            root.left = insertRec(root.left, data);
        else if (data > root.data)
            root.right = insertRec(root.right, data);

        return root;
    }

    // Search for a node
    public TreeNode search(int data) {
        return searchRec(root, data);
    }

    private TreeNode searchRec(TreeNode root, int data) {
        if (root == null || root.data == data)
            return root;

        if (data < root.data)
            return searchRec(root.left, data);

        return searchRec(root.right, data);
    }

    // Delete a node
    public void delete(int data) {
        root = deleteRec(root, data);
    }

    private TreeNode deleteRec(TreeNode root, int data) {
        if (root == null)
            return root;

        if (data < root.data)
            root.left = deleteRec(root.left, data);
        else if (data > root.data)
            root.right = deleteRec(root.right, data);
        else {
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            root.data = minValue(root.right);

            root.right = deleteRec(root.right, root.data);
        }

        return root;
    }

    private int minValue(TreeNode root) {
        int minValue = root.data;
        while (root.left != null) {
            minValue = root.left.data;
            root = root.left;
        }
        return minValue;
    }

    // Inorder traversal
    public void inorderTraversal() {
        inorderTraversalRec(root);
    }

    private void inorderTraversalRec(TreeNode root) {
        if (root != null) {
            inorderTraversalRec(root.left);
            System.out.print(root.data + " ");
            inorderTraversalRec(root.right);
        }
    }
}

public class BST {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

        System.out.println("Inorder Traversal:");
        tree.inorderTraversal();

        int searchData = 40;
        TreeNode result = tree.search(searchData);
        if (result != null) {
            System.out.println("\nNode with data " + searchData + " found.");
        } else {
            System.out.println("\nNode with data " + searchData + " not found.");
        }

        int deleteData = 30;
        tree.delete(deleteData);
        System.out.println("Inorder Traversal after deleting node with data " + deleteData + ":");
        tree.inorderTraversal();
    }
}
