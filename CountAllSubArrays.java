import java.util.* ;
import java.io.*; 

public class Solution {
    public static int findAllSubarraysWithGivenSum(int arr[], int s) {
        int count = 0;
        int cumulativeSum = 0;
        Map<Integer, Integer> sumMap = new HashMap<>();
        sumMap.put(0, 1);
        for (int i = 0; i < arr.length; i++) {
            cumulativeSum += arr[i];
            if (sumMap.containsKey(cumulativeSum - s)) {
                count += sumMap.get(cumulativeSum - s);
            }
            sumMap.put(cumulativeSum, sumMap.getOrDefault(cumulativeSum, 0) + 1);
        }
        return count;
    }
}
