package TREE;

import java.util.Scanner;

public class EmployeeBST {
 
        public static void main(String[] args) {
            Tree tree = new Tree();

            // Insert 10 employees
            tree.insert(149, "Anusha");
            tree.insert(167, "Kosala");
            tree.insert(47,  "Dinusha");
            tree.insert(66,  "Mihiri");
            tree.insert(159, "Jayani");
            tree.insert(118, "Nimal");
            tree.insert(195, "Nishantha");
            tree.insert(34,  "Avodya");
            tree.insert(105, "Bimali");
            tree.insert(133, "Sampath");

            // Traversals
            System.out.println("In-order Traversal:");
            tree.inOrder();

            System.out.println("\nPre-order Traversal:");
            tree.preOrder();

            System.out.println("\nPost-order Traversal:");
            tree.postOrder();

            // Search by user input
            Scanner sc = new Scanner(System.in);
            System.out.print("\nEnter employee number to search: ");
            int searchEmp = sc.nextInt();
            Node result = tree.find(searchEmp);
            if (result != null) {
                System.out.println("Employee found:");
                result.displayNode();
            } else {
                System.out.println("Employee not found.");
            }

            // Delete all and display
            System.out.println("\nDeleting all nodes...");
            tree.deleteAll();

            System.out.println("\nAttempting to display in-order after deletion:");
            tree.inOrder();  // Should print nothing


        }
}
