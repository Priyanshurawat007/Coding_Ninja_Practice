
import java.util.Scanner;
public class areaOfRectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Length:");
        int l=sc.nextInt();
        System.out.println("Enter the Breadth:");
        int b=sc.nextInt();

        double area=l*b;

        System.out.println("Area is:"+area);
    }
    
}
