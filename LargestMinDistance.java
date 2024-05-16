import java.util.ArrayList;

public class Solution 
{
    public static int findLargestMinDistance(ArrayList<Integer> boards, int k)
    {
        long l = 0, r = 0;
        int mod = 10000003;
        for (int i = 0; i < boards.size(); i++) {
            r += boards.get(i);
            l = Math.max(l, boards.get(i));
        }
        long ans = r;
        while (l <= r) {
            long mid = l + (r - l) / 2;
            if (isPossible(k, boards, mid)) {
                ans = mid;
                r = mid - 1;
            } else {
                l = mid + 1;
            }
        }
        return (int)((ans) % mod);
    }

    private static boolean isPossible(int k, ArrayList<Integer> boards, long mid) {
        long time = mid, painters = 1;
        for (int i = 0; i < boards.size(); i++) {
            if (time - boards.get(i) < 0) {
                time = mid;
                painters++;
                if (painters > k) {
                    return false;
                }
            }
            time -= boards.get(i);
        }
        return true;
    }
}
