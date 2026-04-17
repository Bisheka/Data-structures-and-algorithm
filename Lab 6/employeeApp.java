package TREE;

import java.util.Scanner;

public class employeeApp {
    int empNo;
    String name;
    Node left, right;

    public void Node(int empNo, String name) {
        this.empNo = empNo;
        this.name = name;
        this.left = null;
        this.right = null;
    }

    public void displayNode() {
        System.out.println("Employee No: " + empNo + ", Name: " + name);
    }
}

class Tree {
    Node root;

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

    public void inOrder() {
        inOrderTraversal(root);
    }

    public void preOrder() {
        preOrderTraversal(root);
    }

    public void postOrder() {
        postOrderTraversal(root);
    }

    public void deleteAll() {
        root = null;
        System.out.println("All nodes have been deleted.");
    }

    private void inOrderTraversal(Node current) {
        if (current != null) {
            inOrderTraversal(current.left);
            current.displayNode();
            inOrderTraversal(current.right);
        }
    }

    private void preOrderTraversal(Node current) {
        if (current != null) {
            current.displayNode();
            preOrderTraversal(current.left);
            preOrderTraversal(current.right);
        }
    }

    private void postOrderTraversal(Node current) {
        if (current != null) {
            postOrderTraversal(current.left);
            postOrderTraversal(current.right);
            current.displayNode();
        }
    }
}




