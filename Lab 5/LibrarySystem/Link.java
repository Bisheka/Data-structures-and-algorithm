package LibrarySystem;


class Link {
    public int bookID;
    public String title;
    public int copies;
    public Link next;

    // Constructor to initialize Link with book ID, title, and copies
    public Link(int bookID, String title, int copies) {
        this.bookID = bookID;
        this.title = title;
        this.copies = copies;
        this.next = null;
    }

    // Method to display book details
    public void displayLink() {
        System.out.println("ID: " + bookID + ", Title: " + title + ", Copies: " + copies);
    }
}
