import java.util.Scanner;
public class SumOfAllDivisor {
    public static int sumOfAllDivisors(int n){
      int[] sumDivisors = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j += i) {
                sumDivisors[j] += i;
            }
        }
        int totalSum = 0;
        for (int sum : sumDivisors) {
            totalSum += sum;
        }
        return totalSum;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(sumOfAllDivisors(n));

    }
}