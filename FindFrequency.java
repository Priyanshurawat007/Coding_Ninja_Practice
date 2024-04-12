package LeetCode;

import java.util.*;

public class FindFrequency {
    public int[] findFrequency(int n, int[] v) {
        
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        for (int num : v) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        int maxFrequency = Collections.max(frequencyMap.values());
        int minFrequency = Collections.min(frequencyMap.values());
        
  
        int maxElement = Integer.MAX_VALUE;
        int minElement = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() == maxFrequency && entry.getKey() < maxElement) {
                maxElement = entry.getKey();
            }
            if (entry.getValue() == minFrequency && entry.getKey() < minElement) {
                minElement = entry.getKey();
            }
        }
        
        return new int[]{maxElement, minElement};
    }

    public static void main(String[] args) {
        FindFrequency solution = new FindFrequency();

     
        int n = 6;
        int[] v = {1, 2, 3, 1, 1, 4};
        int[] result = solution.findFrequency(n, v);
        System.out.println(Arrays.toString(result)); // Output: [1, 2]
    }
}
