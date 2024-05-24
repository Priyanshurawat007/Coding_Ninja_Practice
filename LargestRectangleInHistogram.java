import java.util.*;

public class Solution {
    public static int largestRectangle(ArrayList<Integer> heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int i = 0;
        while (i < heights.size()) {
            if (stack.isEmpty() || heights.get(stack.peek()) <= heights.get(i)) {
                stack.push(i++);
            } else {
                int top = stack.pop();
                int area = heights.get(top) * (stack.isEmpty() ? i : i - stack.peek() - 1);
                maxArea = Math.max(maxArea, area);
            }
        }
        while (!stack.isEmpty()) {
            int top = stack.pop();
            int area = heights.get(top) * (stack.isEmpty() ? i : i - stack.peek() - 1);
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }
}
