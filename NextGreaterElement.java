import java.util.*;

public class Solution {
    public static int[] nextGreaterElement(int n, int[] arr) {
        // Array to store the result of next greater elements
        int[] result = new int[n];
        // Stack to keep track of indices for which we are looking for next greater element
        Stack<Integer> stack = new Stack<>();
        
        // Traverse the array from right to left
        for (int i = n - 1; i >= 0; i--) {
            // Pop elements from the stack if they are less than or equal to the current element
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }
            
            // If stack is empty, it means there's no greater element to the right
            if (stack.isEmpty()) {
                result[i] = -1;
            } else {
                // The top of the stack is the next greater element
                result[i] = stack.peek();
            }
            
            // Push the current element onto the stack
            stack.push(arr[i]);
        }
        
        return result;
    }

    public static void main(String[] args) {
        // Sample input
        int[] arr1 = {7, 12, 1, 20};
        int[] arr2 = {1, 5, 3, 4, 2};
        int[] arr3 = {5, 5, 5, 5, 5};
        
        // Compute the next greater elements
        int[] result1 = nextGreaterElement(arr1.length, arr1);
        int[] result2 = nextGreaterElement(arr2.length, arr2);
        int[] result3 = nextGreaterElement(arr3.length, arr3);
        
        // Print the results
        System.out.println("NGE for arr1: " + Arrays.toString(result1));
        System.out.println("NGE for arr2: " + Arrays.toString(result2));
        System.out.println("NGE for arr3: " + Arrays.toString(result3));
    }
}
