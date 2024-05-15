import java.util.ArrayList;

public class Solution {
    public static int findPages(ArrayList<Integer> arr, int n, int m) {
        int sum = 0;
        if (n < m) {
            return -1;
        }
        for (int i = 0; i < n; i++) {
            sum += arr.get(i);
        }
        int start = 0, end = sum;
        int result = Integer.MAX_VALUE;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (isPossible(arr, n, m, mid)) {
                result = Math.min(result, mid);
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return result;
    }

    public static boolean isPossible(ArrayList<Integer> arr, int n, int m, int curr_min) {
        int studentsRequired = 1;
        int curr_sum = 0;
        for (int i = 0; i < n; i++) {
            if (arr.get(i) > curr_min) {
                return false;
            }
            if (curr_sum + arr.get(i) > curr_min) {
                studentsRequired++;
                curr_sum = arr.get(i);
                if (studentsRequired > m) {
                    return false;
                }
            } else {
                curr_sum += arr.get(i);
            }
        }
        return true;
    }
}
