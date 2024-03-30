import java.util.Scanner;

public class ExtraShapesQ {
    public static void TotaSurfaceAreaOfCube(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side:");
        int a=sc.nextInt();
        int area=6*a*a;

        System.out.println("Area is "+area);
    }
    public static void CurvedSurfaceAreaOfCylinder(){
        Scanner sc=new Scanner(System.in);
        int r,h;
        System.out.println("Enter the radius: ");
        r=sc.nextInt();
        System.out.println("Enter the hieght:");
        h=sc.nextInt();

        float area= 2*3.14f*r*h;
        System.out.println("Area is "+area);
    }
    public static void main(String[] args) {
        TotaSurfaceAreaOfCube();
        CurvedSurfaceAreaOfCylinder();
    }
}
