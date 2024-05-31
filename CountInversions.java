import java.util.*;

public class Solution {
    public static long getInversions(long arr[], int n) {
        return mergeSortAndCount(arr, 0, n - 1);
    }

    private static long mergeSortAndCount(long[] arr, int left, int right) {
        long count = 0;
        if (left < right) {
            int mid = left + (right - left) / 2;

            count += mergeSortAndCount(arr, left, mid);
            count += mergeSortAndCount(arr, mid + 1, right);
            count += mergeAndCount(arr, left, mid, right);
        }
        return count;
    }

    private static long mergeAndCount(long[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        long[] leftArr = new long[n1];
        long[] rightArr = new long[n2];

        System.arraycopy(arr, left, leftArr, 0, n1);
        System.arraycopy(arr, mid + 1, rightArr, 0, n2);

        int i = 0, j = 0, k = left;
        long inversions = 0;

        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k++] = leftArr[i++];
            } else {
                arr[k++] = rightArr[j++];
                inversions += (n1 - i);
            }
        }

        while (i < n1) {
            arr[k++] = leftArr[i++];
        }

        while (j < n2) {
            arr[k++] = rightArr[j++];
        }

        return inversions;
    }

    public static void main(String[] args) {
        long[] arr1 = {3, 2, 1};
        System.out.println(getInversions(arr1, arr1.length)); // Output: 3

        long[] arr2 = {2, 5, 1, 3, 4};
        System.out.println(getInversions(arr2, arr2.length)); // Output: 4
    }
}
