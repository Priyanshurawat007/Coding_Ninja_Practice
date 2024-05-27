public class Solution {

    public static long transactions(int[] money) {
        
        long currentSum = 0;
        long maxSum = 0;

        for (int transaction : money) {
            currentSum += transaction;
            if (currentSum > maxSum) {
                maxSum = currentSum;
            }
        }

        return maxSum;
    }
}
