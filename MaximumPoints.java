import java.util.*;

public class Solution {
    public static int maximumPoints(int[][] grid, int N) {
        int maxPoints = 0;
        
        // Iterate through each cell of the grid
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                // Check if the cell lies on either diagonal
                if (i == j || i == N - 1 - j) {
                    // Add the value of the cell to the maximum points
                    maxPoints += grid[i][j];
                }
            }
        }
        
        return maxPoints;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // Number of test cases
        
        while (T-- > 0) {
            int N = scanner.nextInt(); // Size of the grid (N x N)
            int[][] grid = new int[N][N];
            
            // Read the grid values
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    grid[i][j] = scanner.nextInt();
                }
            }
            
            // Calculate the maximum points from diagonals
            int result = maximumPoints(grid, N);
            
            // Output the result for the current test case
            System.out.println(result);
        }
        
        scanner.close();
    }
}
