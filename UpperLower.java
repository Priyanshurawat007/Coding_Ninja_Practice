import java.util.Scanner;

public class UpperLower {
    public int CheckCharacter() {
        Scanner sc=new Scanner(System.in);
        // Write your code here
     
        System.out.println("Enter the Character: ");
        char Alpha=sc.next().charAt(0); 
       
        if(Character.isUpperCase(Alpha)){
            return 1;
          }
          else if(Character.isLowerCase(Alpha)){
           return 0;
         }else{
           
           return -1;
         }

    }
    
    public static void main(String[] args) {
       UpperLower up=new UpperLower();
       int result=up.CheckCharacter();
       System.out.println(result);
       
      
    }
}
