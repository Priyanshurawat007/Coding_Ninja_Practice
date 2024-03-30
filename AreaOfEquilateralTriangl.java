import java.util.Scanner;
public class AreaOfEquilateralTriangl {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       int a;
       System.out.println("Enter the length of equalateral triangle side:");
       a=sc.nextInt();
       
       float area=(1.73f*a*a)/4;

       System.out.println("Area is:"+area);
    }
}
