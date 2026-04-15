public class QueueArray {
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
            System.out.println("Queue is full. Cannot insert " + item);
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
            System.out.println("Queue is empty. Nothing to remove.");
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
public void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }
        System.out.print("Queue elements: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queueArray[i]+ " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        QueueArray queue = new QueueArray(5);


        queue.insert(10);
        queue.insert(20);
        queue.insert(30);
        queue.display();
        
        System.out.println("Removed: " + queue.remove());
     
        queue.display();
        
        System.out.println("Front Element: " + queue.peekFront());
        
        System.out.println("Queue Count: " + queue.getCount());
    }
}
