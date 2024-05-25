public class Solution {
    public static int longestRepeatingSubstring(String str, int k) {
        int n = str.length();
        int[][] LCSRe = new int[n + 1][n + 1];
        int resLength = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if (str.charAt(i - 1) == str.charAt(j - 1) && LCSRe[i - 1][j - 1] < (j - i)) {
                    LCSRe[i][j] = LCSRe[i - 1][j - 1] + 1;
                    resLength = Math.max(resLength, LCSRe[i][j]);
                } else {
                    LCSRe[i][j] = 0;
                }
            }
        }

        // The longest repeating substring length cannot exceed min(k, n/2)
        return Math.min(resLength + k, n / 2);
    }

    public static void main(String[] args) {
        String str = "ABCCAA";
        int k = 2;
        int result = longestRepeatingSubstring(str, k);
        System.out.println("Longest repeating substring length after " + k + " operations: " + result);
    }
}
