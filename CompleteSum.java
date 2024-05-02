import java.util.*;

public class Solution {
    public static int[] completeSum(int[] A, int N) {
        // Initialize the array to store prefix sums
        int[] completeSum = new int[N];
        
        // Initialize the prefix sum variable
        int prefixSum = 0;
        
        // Compute the prefix sums
        for (int i = 0; i < N; i++) {
            prefixSum += A[i];
            completeSum[i] = prefixSum;
        }
        
        // Return the array of complete sums
        return completeSum;
    }

    public static void main(String[] args) {
        // Example usage:
        int[] A1 = {3, 1, 2};
        int[] A2 = {1, 1, 1, 1};
        
        int N1 = A1.length;
        int N2 = A2.length;
        
        int[] result1 = completeSum(A1, N1);
        int[] result2 = completeSum(A2, N2);
        
        // Print the results
        System.out.println(Arrays.toString(result1)); // Output: [3, 4, 6]
        System.out.println(Arrays.toString(result2)); // Output: [1, 2, 3, 4]
    }
}
