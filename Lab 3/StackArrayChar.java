import java.util.Scanner;

public class StackArrayChar {
    private int maxSize;
    private char[] stackArray;
    private int top;

    public StackArrayChar(int size) {
        maxSize = size;
        stackArray = new char[maxSize];
        top = -1;
    }

    public void push(char item) {
        if (!isFull()) {
            stackArray[++top] = item;
        }
    }

    public char pop() {
        if (!isEmpty()) {
            return stackArray[top--];
        }
        return '\0';
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        StackArrayChar stack = new StackArrayChar(input.length());
        
        // Push all characters to stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }
        
        // Pop all characters to get reversed string
        System.out.print("Reversed string: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
        System.out.println();
     
    }
}
