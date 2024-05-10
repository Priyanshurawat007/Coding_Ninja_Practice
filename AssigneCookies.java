import java.util.*;
public class Solution {
    public static int assignCookie(int []greed, int []size) {
        // Sort the arrays
        Arrays.sort(greed);
        Arrays.sort(size);

        // Initialize pointers and count
        int i = 0, j = 0;
        int satisfiedChildren = 0;

        // Greedy assignment
        while (i < greed.length && j < size.length) {
            if (size[j] >= greed[i]) {
                satisfiedChildren++;
                i++;
            }
            j++;
        }

        return satisfiedChildren;
    }

}
