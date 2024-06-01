import java.util.* ;
import java.io.*; 

public class Solution {
    public static int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        
        // Initialize the first row and first column
        for (int i = 0; i < m; i++) {
            dp[i][0] = 1;
        }
        for (int j = 0; j < n; j++) {
            dp[0][j] = 1;
        }
        
        // Fill the dp table
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = dp[i-1][j] + dp[i][j-1];
            }
        }
        
        // The bottom-right corner will have the number of unique paths
        return dp[m-1][n-1];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int t = 0; t < T; t++) {
            int M = sc.nextInt();
            int N = sc.nextInt();
            System.out.println(uniquePaths(M, N));
        }
        sc.close();
    }
}
