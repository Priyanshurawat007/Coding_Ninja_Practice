import java.util.*;

public class Solution {
    public static int frogJump(int n, int heights[]) {
        int[] dp = new int[n];
        dp[0] = 0; // Base case: frog is already on the 1st stair

        for (int i = 1; i < n; i++) {
            // Calculate energy required to jump to (i+1)th stair
            int energy1 = Math.abs(heights[i] - heights[i - 1]) + dp[i - 1];

            // Calculate energy required to jump to (i+2)th stair (if possible)
            int energy2 = (i >= 2) ? Math.abs(heights[i] - heights[i - 2]) + dp[i - 2] : Integer.MAX_VALUE;

            // Update dp[i] with the minimum energy
            dp[i] = Math.min(energy1, energy2);
        }

        return dp[n - 1];
    }

    public static void main(String[] args) {
        int[] heights1 = {10, 20, 30, 10};
        System.out.println(frogJump(4, heights1)); // Output: 20

        int[] heights2 = {10, 50, 10};
        System.out.println(frogJump(3, heights2)); // Output: 0
    }
}
