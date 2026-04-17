package TREE;

public class tree {
    Node root;

    // Insert method
    public void insert(int empNo, String name) {
        Node newNode = new Node(empNo, name);
        if (root == null) {
            root = newNode;
            return;
        }
        Node current = root;
        Node parent;
        while (true) {
            parent = current;
            if (empNo < current.empNo) {
                current = current.left;
                if (current == null) {
                    parent.left = newNode;
                    return;
                }
            } else {
                current = current.right;
                if (current == null) {
                    parent.right = newNode;
                    return;
                }
            }
        }
    }

    // Iterative find
    public Node find(int empNo) {
        Node current = root;
        while (current != null) {
            if (empNo == current.empNo) {
                return current;
            } else if (empNo < current.empNo) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return null;
    }

    // Recursive find
    public Node findRecursive(int empNo) {
        if (root == null) return null;
        return findRecursive(empNo, root);
    }

    public Node findRecursive(int empNo, Node current) {
        if (current == null) return null;
        if (empNo == current.empNo) return current;
        if (empNo < current.empNo) return findRecursive(empNo, current.left);
        else return findRecursive(empNo, current.right);
    }

    // In-order
    public void inOrder() {
        Node current = root;
        inOrderTraversal(current);
    }

    private void inOrderTraversal(Node current) {
        if (current != null) {
            inOrderTraversal(current.left);
            current.displayNode();
            inOrderTraversal(current.right);
        }
    }

    // Pre-order
    public void preOrder() {
        Node current = root;
        preOrderTraversal(current);
    }

    private void preOrderTraversal(Node current) {
        if (current != null) {
            current.displayNode();
            preOrderTraversal(current.left);
            preOrderTraversal(current.right);
        }
    }

    // Post-order
    public void postOrder() {
        Node current = root;
        postOrderTraversal(current);
    }

    private void postOrderTraversal(Node current) {
        if (current != null) {
            postOrderTraversal(current.left);
            postOrderTraversal(current.right);
            current.displayNode();
        }
    }

    // Delete all nodes
    public void deleteAll() {
        root = null;
        System.out.println("All nodes have been deleted.");
    }

}
