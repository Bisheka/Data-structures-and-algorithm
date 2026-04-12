public class InsertionSortWithShifts {
    public static int insertionSortAndCountShifts(int[] arr) {
        int n = arr.length;
        int shiftCount = 0;
        for (int j = 1; j < n; j++) {
            int key = arr[j];
            int i = j - 1;
            while (i >= 0 && arr[i] > key) {
                arr[i + 1] = arr[i];
                i = i - 1;
                shiftCount++;
            }
            arr[i + 1] = key;
        }
        return shiftCount;
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 8, 6, 2};
        int shifts = insertionSortAndCountShifts(arr);

        // Using a regular for loop to print the array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("\nTotal shifts: " + shifts);
    }
}
