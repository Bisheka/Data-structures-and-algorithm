public class StepSimulation {
    public static void insertionSortWithSteps(int[] arr) {
        int n = arr.length;
        for (int j = 1; j < n; j++) {
            int key = arr[j];
            int i = j - 1;
            System.out.println("Step " + j + ": Inserting " + key);
            while (i >= 0 && arr[i] > key) {
                arr[i + 1] = arr[i];
                i = i - 1;
                printArray(arr);
            }
            arr[i + 1] = key;
            printArray(arr);
        }
        System.out.println("Final Sorted Array:");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        // Using a regular for loop instead of enhanced for loop
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 6, 2};
        insertionSortWithSteps(arr);
    }
}
