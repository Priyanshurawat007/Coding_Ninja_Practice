import java.util.Scanner;
public class AreaOfRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p,q;
        System.out.println("Enter the length of rhombus's first diagonal:");
        p=sc.nextInt();
        System.out.println("Enter the length of rhombus's second diagonal:");
        q=sc.nextInt();
        
        double area=(p*q)/2;

        System.out.println("Area is:"+area);
        
    }

}
