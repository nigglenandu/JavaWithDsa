package CodeSheet;

public class Bubblesort {

    // Utility method to print array elements
    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {

        int[] arr = {4, 6, 3, 8, 1}; // Unsorted array

        // Bubble Sort Algorithm
        // Outer loop -> runs n-1 times
        for (int i = 0; i < arr.length - 1; i++) {
            // Inner loop -> compares adjacent elements
            for (int j = 0; j < arr.length - 1; j++) {
                // If current element > next element, swap them
                if (arr[j] > arr[j+1]) {
                    int temp = arr[j];     // temporary variable for swapping
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        // Print the sorted array
        printArray(arr);
    }
}
