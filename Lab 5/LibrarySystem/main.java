package LibrarySystem;

public class main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Insert initial books
        list.insertFirst(1, "Hello", 15);
        list.insertFirst(2, "World", 4);
        list.insertFirst(3, "Welcome", 8);

        System.out.println("List after insertions:");
        list.displayList();

        // Add a new book after a specific book ID (insert after ID 2)
        list.insertAfter(2, 4, "Java", 12);
        System.out.println("\nList after inserting new book after ID 2:");
        list.displayList();

        // Find a book by ID
        Link book = list.find(3);
        if (book != null) {
            System.out.println("\nFound book with ID 3:");
            book.displayLink();
        } else {
            System.out.println("\nBook with ID 3 not found.");
        }

        // Remove a book by ID (remove ID 1)
        list.delete(1);
        System.out.println("\nList after deleting book with ID 1:");
        list.displayList();

        // Delete the first book
        list.deleteFirst();
        System.out.println("\nList after deleting the first book:");
        list.displayList();
    }
}
