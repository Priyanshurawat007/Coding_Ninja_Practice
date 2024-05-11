import java.util.* ;
import java.io.*; 
public class Solution {
    public static ArrayList<String> validParenthesis(int n){
             ArrayList<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }

    private static void backtrack(ArrayList<String> result, String current, int openCount, int closeCount, int n) {
        if (current.length() == 2 * n) {
            result.add(current);
            return;
        }
        if (openCount < n) {
            backtrack(result, current + "(", openCount + 1, closeCount, n);
        }
        if (closeCount < openCount) {
            backtrack(result, current + ")", openCount, closeCount + 1, n);
        }
    }

}
