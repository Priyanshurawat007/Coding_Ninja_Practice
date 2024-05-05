public class Solution {
    public static boolean lemonadeChange(int []bill) {
        int count5 = 0; // Number of 5 rupees bills
        int count10 = 0; // Number of 10 rupees bills
        
        // Iterate through each customer's bill
        for (int bills : bill) {
            if (bills == 5) {
                // Collect 5 rupees bill
                count5++;
            } else if (bills == 10) {
                // Need to provide 5 rupees change
                if (count5 == 0) {
                    // No 5 rupees bill available to give change
                    return false;
                }
                count5--; // Use one 5 rupees bill as change
                count10++; // Receive 10 rupees bill
            } else if (bills == 20) {
                // Need to provide 15 rupees change (one 10 and one 5)
                if (count10 > 0 && count5 > 0) {
                    // Use one 10 rupees bill and one 5 rupees bill as change
                    count10--;
                    count5--;
                } else if (count5 >= 3) {
                    // Use three 5 rupees bills as change
                    count5 -= 3;
                } else {
                    // Not enough change available
                    return false;
                }
            }
        }
        
        // If all transactions are successful
        return true;
    }
}
