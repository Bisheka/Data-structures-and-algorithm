package TREE;

public class Node {

        int empNo;
        String name;
        Node left, right;

        public Node(int empNo, String name) {
            this.empNo = empNo;
            this.name = name;
            this.left = null;
            this.right = null;
        }

        public void displayNode() {
            System.out.println("Employee No: " + empNo + ", Name: " + name);
        }
    }



