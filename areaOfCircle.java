import java.util.Scanner;

public class areaOfCircle {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the value of R:");
        int r=sc.nextInt();
    
     float pi=3.14f;

     float area=pi*r*r;
     System.out.println("Area of Circle is:"+area);
    }
    
}
