import java.util.*;

public class Solution {
    public static int maximumSumRectangle(int[][] arr, int N, int M) {
        int maxSum = Integer.MIN_VALUE;
        
        for (int startRow = 0; startRow < N; startRow++) {
            int[] temp = new int[M];
            
            for (int endRow = startRow; endRow < N; endRow++) {
                // Update the temp array with the sum of elements between startRow and endRow for each column
                for (int col = 0; col < M; col++) {
                    temp[col] += arr[endRow][col];
                }
                
                // Use Kadane's algorithm to find the maximum subarray sum in the temp array
                int currentMax = temp[0];
                int maxEndingHere = temp[0];
                
                for (int col = 1; col < M; col++) {
                    maxEndingHere = Math.max(temp[col], maxEndingHere + temp[col]);
                    currentMax = Math.max(currentMax, maxEndingHere);
                }
                
                // Update the maximum sum found
                maxSum = Math.max(maxSum, currentMax);
            }
        }
        
        return maxSum;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt();
        
        while (T-- > 0) {
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            int[][] arr = new int[N][M];
            
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < M; j++) {
                    arr[i][j] = scanner.nextInt();
                }
            }
            
            int maxSum = maximumSumRectangle(arr, N, M);
            System.out.println(maxSum);
        }
        
        scanner.close();
    }
}
