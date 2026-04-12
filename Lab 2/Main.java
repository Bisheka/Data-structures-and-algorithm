public class InsertionSort {
    public static void insertionSortAscending(int[] arr) {
        int n = arr.length;
        for (int j = 1; j < n; j++) {
            int key = arr[j];
            int i = j - 1;
            while (i >= 0 && arr[i] > key) {
                arr[i + 1] = arr[i];
                i = i - 1;
            }
            arr[i + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 6, 2};
        insertionSortAscending(arr);

        // Using a regular for loop to print the array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
