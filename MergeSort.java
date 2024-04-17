import java.util.Arrays;

public class MergeSort {
    public static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int mid = l + (r - l) / 2;
            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);
            merge(arr, l, mid, r);
        }
    }
    
    private static void merge(int[] arr, int l, int mid, int r) {
        int n1 = mid - l + 1;
        int n2 = r - mid;
        
        int[] left = new int[n1];
        int[] right = new int[n2];
        
        for (int i = 0; i < n1; i++) {
            left[i] = arr[l + i];
        }
        for (int j = 0; j < n2; j++) {
            right[j] = arr[mid + 1 + j];
        }
        
        int i = 0, j = 0, k = l;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++];
            } else {
                arr[k++] = right[j++];
            }
        }
        
        while (i < n1) {
            arr[k++] = left[i++];
        }
        while (j < n2) {
            arr[k++] = right[j++];
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 13, 4, 1, 3, 6, 28};
        int l1 = 0, r1 = arr1.length - 1;
        mergeSort(arr1, l1, r1);
        System.out.println(Arrays.toString(arr1)); // Output: [1, 2, 3, 4, 6, 13, 28]
        
        int[] arr2 = {9, 3, 6, 2, 0};
        int l2 = 0, r2 = arr2.length - 1;
        mergeSort(arr2, l2, r2);
        System.out.println(Arrays.toString(arr2)); // Output: [0, 2, 3, 6, 9]
    }
}
