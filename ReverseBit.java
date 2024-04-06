import java.util.Scanner;

public class ReverseBit {
    public static long reverseBits(long n) {
        long reversed = 0;
        for (int i = 0; i < 32; i++) {
            reversed <<= 1;
            reversed |= (n & 1); 
            n >>= 1;
        }
        return reversed;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            long n = sc.nextLong();
            System.out.println(reverseBits(n));
        }
    }
}
