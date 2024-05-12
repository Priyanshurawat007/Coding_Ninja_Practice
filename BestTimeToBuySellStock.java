public class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        int n = prices.length;
        if (n == 0) {
            return 0; // No profit can be made with an empty array
        }

        int buy = prices[0]; // Initialize the buy price
        int maxProfit = 0; // Initialize the maximum profit

        for (int i = 1; i < n; i++) {
            // Calculate the profit if selling on the current day
            int profit = prices[i] - buy;
            // Update maxProfit if the current profit is greater
            maxProfit = Math.max(maxProfit, profit);
            // Update buy if the current price is lower than the previous buy price
            buy = Math.min(buy, prices[i]);
        }

        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices1 = {7, 1, 5, 6, 4};
        System.out.println(maxProfit(prices1)); // Output: 5

        int[] prices2 = {5, 4, 3, 2, 1};
        System.out.println(maxProfit(prices2)); // Output: 0
    }
}
