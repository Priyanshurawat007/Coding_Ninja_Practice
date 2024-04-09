import java.util.Scanner;
public class ExtractDigits2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Digits: ");
        int num=sc.nextInt();
        int count=0;
        int reverseNum=0;
        int temp=num;
        int sum=0;

        while (num>0) {
            int lastDigit=num%10;
            System.out.println(lastDigit);
            count++;

            num=num/10; 
            reverseNum=reverseNum*10+lastDigit;  
            sum=sum+(lastDigit*lastDigit*lastDigit);
            
        }
      
        System.out.println(count); //1.Extract Digit
        System.out.println(reverseNum); //Reverse Number

        // Palindrom Number
        if(reverseNum==temp){
            System.out.println("It's a Palindrome Number");
        }
        else{
    System.out.println("Its not a palindrome number");

}
// Armstrong Number
if(sum==temp){
    System.out.println("Armstrong");
}else{
    System.out.println( "Not an Armstrong Number");
}


       
    }
    
}
