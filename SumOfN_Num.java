package LeetCode;

public class SumOfN_Num {
    
        public static long sumFirstN(long n) {
            // Write your code here.
            long sum=0;
            for(long i=1;i<=n;i++){
            sum=sum+i;
            }
    
            return sum;
        }
    }

