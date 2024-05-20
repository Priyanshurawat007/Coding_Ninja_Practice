import java.util.*;

public class Solution {
    public static List<Integer> printDivisors(int n) {
        List<Integer> divisors = new ArrayList<>();
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                // If divisors are equal, add only one
                if (n / i == i) {
                    divisors.add(i);
                } else { // Otherwise add both
                    divisors.add(i);
                    divisors.add(n / i);
                }
            }
        }
        Collections.sort(divisors);
        return divisors;
    }
}
