package LinkedList;

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

    // Method to insert a new student record at the beginning of the list
    public void insertFirst(int id, int marks) {
        Link newLink = new Link(id, marks);
        newLink.next = first;
        first = newLink;
    }

    // Method to insert a new student record after a given student id
    public void insertAfter(int key, int id, int marks) {
        Link current = first;
        while (current != null && current.id != key) {
            current = current.next;
        }

        if (current != null) {
            Link newLink = new Link(id, marks);
            newLink.next = current.next;
            current.next = newLink;
        } else {
            System.out.println("Student with ID " + key + " not found.");
        }
    }

    // Method to find a student by id
    public Link find(int key) {
        Link current = first;
        while (current != null) {
            if (current.id == key) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    // Method to delete the first student record
    public void deleteFirst() {
        if (!isEmpty()) {
            first = first.next;
        } else {
            System.out.println("List is empty.");
        }
    }

    // Method to delete a student by id
    public void delete(int key) {
        if (isEmpty()) {
            System.out.println("List is empty.");
            return;
        }

        if (first.id == key) {
            first = first.next;
            return;
        }

        Link current = first;
        while (current.next != null && current.next.id != key) {
            current = current.next;
        }

        if (current.next != null) {
            current.next = current.next.next;
        } else {
            System.out.println("Student with ID " + key + " not found.");
        }
    }

    // Method to display all student records
    public void displayList() {
        Link current = first;
        while (current != null) {
            current.displayLink();
            current = current.next;
        }
    }
}



