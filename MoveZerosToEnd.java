public class Solution {
        public static int[] moveZeros(int n, int []a) {
    int index = 0;
        // Iterate through the array
        for (int i = 0; i < n; i++) {
            // If the current element is not zero, move it to the front of the array
            if (a[i] != 0) {
                a[index++] = a[i];
            }
        }
        // Fill the remaining elements with zeros
        while (index < n) {
            a[index++] = 0;
        }
        return a;
    }
}
