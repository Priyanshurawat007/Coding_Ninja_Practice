import java.util.Scanner;
public class SumOfOddEven {
    public void EvenSum(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int evenSum=0;
        int oddSum=0;
        while (n!=0){
            int digit=n%10;
            if(digit%2==0) {
                evenSum+=digit;
                }
                else{
                    oddSum+=digit;
                }

            n/=10; //it keep transfering the digit of n until it become 0
        }
        System.out.println(evenSum+" "+oddSum);
    

    }
    public static void main(String[] args) {
        SumOfOddEven se= new SumOfOddEven();
        se.EvenSum();
        

    }
    
}
