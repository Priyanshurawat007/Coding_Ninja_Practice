import java.util.*;
public class BasicMath {
    public static void countDigit(int n){
        int count=0;
        while(n>0){
            int lastDigit=n%10;
            
            count++;
            n/=10;

        }
        System.out.println("Total Digit:"+count);
       
        
    }
    public static void reverseNum(int n){
        int reverseNum=0;
        int lastDigit=0;
        while (n>0) {
            lastDigit = n % 10;
            n=n/10;
            reverseNum=reverseNum*10+lastDigit; 
            
        }
        System.out.println("Reversed Number:"+reverseNum);
    }
    public static void Armstrong(int n){
        int temp=n;
        int sum=0;
        while (n>0) {
            int lastDigit = n % 10;
            n=n/10;
            sum=sum+(lastDigit*lastDigit*lastDigit);
            
        }
        if (temp==sum) {
            System.out.println("Armstrong number");
            
        }else{
            System.out.println("Not an Armstrong number");
        }
    }
    public static void Palindrom(int n){
        int temp=n;
        int reverseNum=0;
        while (n>0) {
            int lastDigit=n%10;
            n=n/10;
            reverseNum=reverseNum*10+lastDigit; 
         }
         if (reverseNum==temp) {
            System.out.println("Palindrom Number");
            
         }else{
            System.out.println( "Not a palindrome number");
         }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number: ");
        int n=sc.nextInt();
        countDigit(n);
        reverseNum(n);
        Armstrong(n); //Eg-371
        Palindrom(n); //Eg-121,212

        
    }
    
}
