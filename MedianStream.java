import java.util.PriorityQueue;
import java.util.Comparator;

public class Solution {
    public static int[] findMedian(int[] arr, int n) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            maxHeap.add(arr[i]);
            if (maxHeap.size() > minHeap.size() + 1) {
                minHeap.add(maxHeap.poll());
            } else if (!minHeap.isEmpty() && maxHeap.peek() > minHeap.peek()) {
                minHeap.add(maxHeap.poll());
                maxHeap.add(minHeap.poll());
            }
            if (maxHeap.size() == minHeap.size()) {
                result[i] = (maxHeap.peek() + minHeap.peek()) / 2;
            } else {
                result[i] = maxHeap.peek();
            }
        }
        return result;
    }
}
