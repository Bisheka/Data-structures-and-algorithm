package LinkedList;

// Link class to hold student id and marks
class Link {
    public int id;
    public int marks;
    public Link next;

    // Constructor to initialize Link with student id and marks
    public Link(int id, int marks) {
        this.id = id;
        this.marks = marks;
        this.next = null;
    }

    // Method to display student details
    public void displayLink() {
        System.out.println("ID: " + id + ", Marks: " + marks);
    }
}

