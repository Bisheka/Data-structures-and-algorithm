package LinkedList;

public class main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Inserting student records
        list.insertFirst(101, 85);
        list.insertFirst(102, 90);
        list.insertFirst(103, 75);

        System.out.println("List after insertions:");
        list.displayList();

        // Deleting student with ID 102
        list.delete(102);
        System.out.println("\nList after deleting ID 102:");
        list.displayList();

        // Deleting the first student record
        list.deleteFirst();
        System.out.println("\nList after deleting first element:");
        list.displayList();
    }
}
