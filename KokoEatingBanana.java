public class Solution {
    public static int minimumRateToEatBananas(int []v, int h) {
       int left = 1;
        int right = getMaxPiles(v);

        // Perform binary search to find the minimum eating speed
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (canEatAll(v, h, mid)) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    // Helper function to calculate the maximum number of bananas in any pile
    private static int getMaxPiles(int[] v) {
        int max = 0;
        for (int bananas : v) {
            if (bananas > max) {
                max = bananas;
            }
        }
        return max;
    }

    // Helper function to check if eating at a given speed `m` allows eating all bananas within `h` hours
    private static boolean canEatAll(int[] v, int h, int m) {
        int hoursNeeded = 0;
        for (int bananas : v) {
            hoursNeeded += (bananas + m - 1) / m; // Equivalent to ceil(bananas / m)
        }
        return hoursNeeded <= h;
    }

}



