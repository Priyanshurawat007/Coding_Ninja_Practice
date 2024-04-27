public class Solution {

    public int maxSubArraySum(int[] arr) {
        if (arr == null || arr.length == 0) {
            return 0; // Return 0 if array is empty
        }

        int maxEndingHere = arr[0]; // Maximum sum of subarray ending at current index
        int maxSoFar = arr[0];      // Maximum sum of subarray encountered so far

        // Traverse through the array starting from the second element
        for (int i = 1; i < arr.length; i++) {
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        // If the maximum subarray sum is negative, return 0
        if (maxSoFar < 0) {
            return 0;
        }

        return maxSoFar;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] arr = {-7, -8, -16, -4, -8, -5, -7, -11, -10, -12, -4, -6, -4, -16, -10};
        int maxSum = solution.maxSubArraySum(arr);
        System.out.println("Maximum subarray sum: " + maxSum);
    }
}
