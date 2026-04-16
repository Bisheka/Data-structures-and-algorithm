package LibrarySystem;

class LinkedList {
    private Link first;

    // Constructor to initialize the LinkedList
    public LinkedList() {
        first = null;
    }

    // Method to check if the list is empty
    public boolean isEmpty() {
        return first == null;
    }

    // Method to insert a new book record at the beginning of the list
    public void insertFirst(int bookID, String title, int copies) {
        Link newLink = new Link(bookID, title, copies);
        newLink.next = first;
        first = newLink;
    }

    // Method to insert a new book record after a specific book ID
    public void insertAfter(int key, int bookID, String title, int copies) {
        Link current = first;
        while (current != null && current.bookID != key) {
            current = current.next;
        }

        if (current != null) {
            Link newLink = new Link(bookID, title, copies);
            newLink.next = current.next;
            current.next = newLink;
        } else {
            System.out.println("Book with ID " + key + " not found.");
        }
    }

    // Method to find a book by ID
    public Link find(int key) {
        Link current = first;
        while (current != null) {
            if (current.bookID == key) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    // Method to delete the first book record
    public void deleteFirst() {
        if (!isEmpty()) {
            first = first.next;
        } else {
            System.out.println("List is empty.");
        }
    }

    // Method to delete a book by ID
    public void delete(int key) {
        if (isEmpty()) {
            System.out.println("List is empty.");
            return;
        }

        if (first.bookID == key) {
            first = first.next;
            return;
        }

        Link current = first;
        while (current.next != null && current.next.bookID != key) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        } else {
            System.out.println("Book with ID " + key + " not found.");
        }
    }

    // Method to display all book records
    public void displayList() {
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
    }
}

