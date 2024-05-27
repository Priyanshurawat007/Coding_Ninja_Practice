import java.util.* ;
import java.io.*; 
public class Solution {
    static int chocPrice(int n) {
          int totalCost = n * 10;
        
        // Step 2: Calculate the number of sets of 5 chocolates
        int numberOfDiscounts = n / 5;
        
        // Step 3: Calculate total discount
        int totalDiscount = numberOfDiscounts * 48;
        
        // Step 4: Calculate the final amount to pay
        int finalAmount = totalCost - totalDiscount;
        
        return finalAmount;
    }
}
