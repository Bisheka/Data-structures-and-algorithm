import java.util.Scanner;

public class ParenthesesChecker {
    private int maxSize;
    private char[] stackArray;
    private int top;

    public ParenthesesChecker(int size) {
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
        return 0;
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public boolean isFull() {
        return (top == maxSize - 1);
    }

    public boolean isBalanced(String str) {
        ParenthesesChecker stack = new ParenthesesChecker(str.length());

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            // Push opening brackets
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            }
            // Check closing brackets
            else if (ch == ')' || ch == ']' || ch == '}') {
                if (stack.isEmpty()) {
                    return false;
                }
                char topChar = stack.pop();

                // Check if brackets match
                if ((ch == ')' && topChar != '(') ||
                        (ch == ']' && topChar != '[') ||
                        (ch == '}' && topChar != '{')) {
                    return false;
                }
            }
        }

        // Expression is balanced only if stack is empty
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an expression with parentheses:");
        String input = scanner.nextLine();

        ParenthesesChecker stack = new ParenthesesChecker(input.length());
        boolean result = stack.isBalanced(input);

        if (result) {
            System.out.println("The expression has balanced parentheses.");
        } else {
            System.out.println("The expression has imbalanced parentheses.");
        }
        
    }
}
