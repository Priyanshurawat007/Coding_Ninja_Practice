public class Solution {
    public static int ninjaTraining(int n, int points[][]) {
        // Initialize DP arrays
        int[] dp_r = new int[n];
        int[] dp_f = new int[n];
        int[] dp_l = new int[n];

        // Base cases
        dp_r[0] = points[0][0];
        dp_f[0] = points[0][1];
        dp_l[0] = points[0][2];

        // Calculate maximum merit points
        for (int i = 1; i < n; i++) {
            dp_r[i] = points[i][0] + Math.max(dp_f[i - 1], dp_l[i - 1]);
            dp_f[i] = points[i][1] + Math.max(dp_r[i - 1], dp_l[i - 1]);
            dp_l[i] = points[i][2] + Math.max(dp_r[i - 1], dp_f[i - 1]);
        }

        // Find the maximum merit points at the last day
        return Math.max(dp_r[n - 1], Math.max(dp_f[n - 1], dp_l[n - 1]));
    }
}
