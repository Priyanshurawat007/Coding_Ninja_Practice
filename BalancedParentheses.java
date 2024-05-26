import java.util.*;
public class Solution {
    public static boolean isBalanced(String s) {
        // Initialize a stack to store opening brackets
        Stack<Character> stack = new Stack<>();

        // Iterate through each character in the string
        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') {
                // If it's an opening bracket, push it onto the stack
                stack.push(ch);
            } else {
                // If it's a closing bracket, check if it matches the top of the stack
                if (stack.isEmpty()) {
                    return false; // Unbalanced: no matching opening bracket
                }
                char top = stack.pop();
                if ((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' && top != '[')) {
                    return false; // Unbalanced: mismatched brackets
                }
            }
        }

        // If the stack is empty, all brackets are balanced
        return stack.isEmpty();
    }
}
