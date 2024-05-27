public class Solution {
    static int[] findPair(int x, int y) {
       if ((x + y) % 2 == 0 && (x - y) % 2 == 0) {
            int a = (x + y) / 2;
            int b = (x - y) / 2;
            return new int[] {a, b};
        } else {
            return new int[] {-1, -1};
        }
    }
}
