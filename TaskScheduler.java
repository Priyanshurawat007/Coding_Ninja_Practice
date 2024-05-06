import java.util.*;
import java.util.*;

public class Solution {
    public static int taskScheduler(String tasks, int n, int t) {
        // Array to store frequency of each task (assuming uppercase English letters)
        int[] taskCount = new int[26];
        
        // Calculate frequency of each task
        for (char task : tasks.toCharArray()) {
            taskCount[task - 'A']++;
        }
        
        // Priority queue to store task frequencies in descending order
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        
        // Add frequencies to max heap
        for (int count : taskCount) {
            if (count > 0) {
                maxHeap.offer(count);
            }
        }
        
        int totalTime = 0;
        
        while (!maxHeap.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            int k = t + 1; // cooldown interval + 1
            
            // Place tasks in the current cycle
            for (int i = 0; i < k; i++) {
                if (!maxHeap.isEmpty()) {
                    temp.add(maxHeap.poll());
                }
            }
            
            // Decrease remaining tasks and add back to heap if still available
            for (int count : temp) {
                if (--count > 0) {
                    maxHeap.offer(count);
                }
            }
            
            // Increment total time by k (completed tasks + idle time)
            totalTime += maxHeap.isEmpty() ? temp.size() : k;
        }
        
        return totalTime;
    }
    
    public static void main(String[] args) {
        // Example usage
        String tasks = "AAABBB"; // Tasks string
        int n = tasks.length(); // Number of tasks
        int t = 2; // Cooldown period
        
        int result = taskScheduler(tasks, n, t);
        System.out.println("Minimum time to complete tasks: " + result);
    }
}
