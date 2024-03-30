import java.util.Scanner;
public class VolumeOfShapes {
    public static void VolumeOfCone(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the radius of cone:");
        int r=sc.nextInt();
        System.out.println("Enter the height of cone:");
        int h=sc.nextInt();
        float volume=0.33f*(3.14f*r*r*h);

        System.out.println("Volume is: "+volume);
    }
    public static void VolumeOfPrism(){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter length of prism: ");
        int l=sc.nextInt();
        System.out.print("Enter width of prism: ");
        int w=sc.nextInt();

        float volume=l*w;
        System.out.println("Volume is: "+volume);

    }
    public static void VolumeOfCylinder(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Hieght: ");
        int h=sc.nextInt();
        System.out.println("Enter the radis: ");
        int r=sc.nextInt();
        float volume=3.14f*r*r*h;

        System.out.println("Volume is: "+volume);
    }
    public static void VolumeOfSphere(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius: ");
        int r=sc.nextInt();
        float volume=4*(3.14f)*(r*r*r)/3;
        System.out.println("The volume of sphere is :"+volume);

    }
    public static void VolumeOfPyramid(){
        Scanner sc=new Scanner(System.in);
        int l,b,h;
        System.out.println("Enter the length: ");
        l=sc.nextInt();
        System.out.println("Enter the breadth: ");
        b=sc.nextInt();
        System.out.println("Enter the Hieght: ");
        h=sc.nextInt();

        float volume=(l*b*h)/3;
        System.out.println("Volume is: "+volume);

    }

    public static void main(String[] args) {
        VolumeOfCone();
        VolumeOfPrism();
        VolumeOfCylinder();
        VolumeOfSphere();
        VolumeOfPyramid();
        
    }
}
