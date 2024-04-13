package LeetCode;

public class SelectionSort {
    public static void selectionSort(int[] arr) {
       int n = arr.length;
        
        // Iterate through the array
        for (int i = 0; i < n - 1; i++) {
            // Assume the current index as the minimum index
            int minIndex = i;
            
            // Iterate through the unsorted part of the array
            for (int j = i + 1; j < n; j++) {
                // Update the minimum index if a smaller element is found
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            
            // Swap the minimum element with the element at the current index
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}