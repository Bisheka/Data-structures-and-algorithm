import java.util.Scanner;
 
  public class MaximumOfThreeNumbers {
     
      public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

 //Input 3 numbers
        System.out.println("Enter first number:");
        int a = input.nextInt();

        System.out.println("Enter second number:");
        int b = input.nextInt();

        System.out.println("Enter third number:");
        int c = input.nextInt();

        int max;
  //Find the maximum number
        if (a > b && a > c) {
            max = a;
        } else if (b > a && b > c) {
            max = b;
        } else {
            max = c;
        }

 //Display results
        System.out.println("The maximum number is "+max);
    }
}
