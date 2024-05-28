import java.util.*;

public class Solution {
    public static String removeKDigits(String num, int k) {
        int len = num.length();
        if (k == len) return "0";

        Stack<Character> stack = new Stack<>();
        for (char c : num.toCharArray()) {
            while (!stack.isEmpty() && k > 0 && stack.peek() > c) {
                stack.pop();
                k--;
            }
            stack.push(c);
        }

        // Remove any remaining digits if k is still greater than 0
        while (k > 0) {
            stack.pop();
            k--;
        }

        // Build the resulting number from the stack
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        sb.reverse();

        // Remove leading zeros
        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        // Example usage:
        System.out.println(removeKDigits("123", 1)); // Output: "12"
        System.out.println(removeKDigits("3214", 2)); // Output: "14"
        System.out.println(removeKDigits("141", 1)); // Output: "11"
    }
}
