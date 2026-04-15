import java.util.Scanner;

public class CircularQueueArray {
    private int[] queueArray;
    private int maxSize;
    private int front;
    private int rear;
    private int currentSize;


    public QueueArray(int size) {
        maxSize = size;
        queueArray = new int[maxSize];
        front = 0;
        rear = -1;
        currentSize = 0;
    }

    public void insert(int item) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        if (rear == maxSize - 1) {
            rear = -1;
        }
        queueArray[++rear] = item;
        currentSize++;
    }

    public int remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int temp = queueArray[front++];
        if (front == maxSize) {
            front = 0;
        }
        currentSize--;
        return temp;
    }


    public int peekFront() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Nothing to peek.");
            return -1;
        }
        return queueArray[front];
    }

    public boolean isEmpty() {
        return (currentSize == 0);
    }

    public boolean isFull() {
        return (currentSize == maxSize);
    }

    public int getCount() {
        return currentSize;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the size of the circular queue: ");
        int size = scanner.nextInt();
        QueueArray queue = new QueueArray(size);

        for (int i = 0; i < size; i++) {
            System.out.print("Enter element to insert: ");
            int element = scanner.nextInt();
            queue.insert(element);
        }

        System.out.print("Enter new element to insert: ");
        int extraElement = scanner.nextInt();
        queue.insert(extraElement);

        System.out.println("Removing: " + queue.remove());

        System.out.print("Enter new element to insert: ");
        int newElement = scanner.nextInt();
        queue.insert(newElement);

        System.out.print("Enter another element to insert: ");
        int finalElement = scanner.nextInt();
        queue.insert(finalElement);

    }
}
