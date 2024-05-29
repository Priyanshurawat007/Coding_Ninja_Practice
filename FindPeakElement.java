import java.util.ArrayList;

public class Solution {
    public static int findPeakElement(ArrayList<Integer> arr) {
        int low = 0;
        int high = arr.size() - 1;
        
        while (low <= high) {
            int mid = low + (high - low) / 2;

            boolean leftSmaller = (mid == 0) || (arr.get(mid - 1) < arr.get(mid));
            boolean rightSmaller = (mid == arr.size() - 1) || (arr.get(mid + 1) < arr.get(mid));
            
            if (leftSmaller && rightSmaller) {
                return mid; // mid is a peak element
            }
            
            if (mid > 0 && arr.get(mid - 1) > arr.get(mid)) {
                high = mid - 1;
            } else { // Else, move to the right half
                low = mid + 1;
            }
        }
        

        return -1;
    }
}
