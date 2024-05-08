public class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        // Check if (n & (n - 1)) == 0
        return (n & (n - 1)) == 0;
    }
    
    public static void main(String[] args) {
        Solution solution = new Solution();
        
        // Example 1: 16 is a power of two (2^4)
        int n1 = 16;
        System.out.println(solution.isPowerOfTwo(n1)); // Output: true
        
        // Example 2: 10 is not a power of two
        int n2 = 10;
        System.out.println(solution.isPowerOfTwo(n2)); // Output: false
    }
}
