import java.util.Arrays;

public class Solution {
    public static int aggressiveCows(int[] arr, int k) {
        int n = arr.length;
        Arrays.sort(arr);
        int start = 0;
        int end = arr[n - 1] - arr[0];
        int result = -1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (check(mid, arr, n, k)) {
                result = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return result;
    }

    private static boolean check(int mid, int arr[], int n, int k) {
        int cows = 1;
        int pos = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] - pos >= mid) {
                pos = arr[i];
                cows++;
                if (cows == k)
                    return true;
            }
        }
        return false;
    }
}
