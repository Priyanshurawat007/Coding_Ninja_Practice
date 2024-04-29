import java.util.ArrayList;

public class Solution {
    public static int singleNonDuplicate(ArrayList<Integer> arr) {
        int low = 0;
        int high = arr.size() - 1;
        
        while (low < high) {
            int mid = low + (high - low) / 2;
            
            // Check if mid is even or odd (to identify which side to move)
            boolean isEven = (mid % 2 == 0);
            
            if (arr.get(mid).equals(arr.get(mid + 1))) {
                if (isEven) {
                    low = mid + 2; // Move to the right of the pair
                } else {
                    high = mid - 1; // Move to the left of the pair
                }
            } else if (arr.get(mid).equals(arr.get(mid - 1))) {
                if (isEven) {
                    high = mid - 2; // Move to the left of the pair
                } else {
                    low = mid + 1; // Move to the right of the pair
                }
            } else {
                return arr.get(mid); // Found the single element
            }
        }
        
        return arr.get(low); // Return the single element
    }
}
