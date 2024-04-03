import java.util.Scanner;
public class CountDigitCN {
    public static int countDigits(int n){
       String numStr = String.valueOf(n);
        int count = 0;

        for (int i = 0; i < numStr.length(); i++) {
            int digit = Character.getNumericValue(numStr.charAt(i));
            if (digit != 0 && n % digit == 0) {
                count++;
            }
        }

        return count;
    }
        
          public static void main(String args[]){
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            System.out.println(countDigits(n));
    }
}