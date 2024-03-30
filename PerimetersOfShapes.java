import java.util.Scanner;
public class PerimetersOfShapes {

    public static void PerimeterOfCircle(){
        System.out.println("Perimeter of Circle");
        Scanner sc=new Scanner(System.in);
        int r;
        System.out.println("Enter the radius of circle:");
        r=sc.nextInt();
        float Cir_Peri=2*3.14f*r;
        
        System.out.println("Perimeter of Circle is"+ Cir_Peri);
    }
    public static void PerimeterOfEquilateralTriangle(){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the side:");
        int a=sc.nextInt();

        float ETri_Peri=3*a;

        System.out.println("Perimeter is:"+ETri_Peri);
    }
    public static void PerimeterOfParallelogram(){
        System.out.println("Perimeter of Parallelogram");
        Scanner sc = new Scanner(System.in);
        int a,b;
        System.out.println("Enter the hight:");
        a=sc.nextInt();
        System.out.println("Enter the base:");
        b=sc.nextInt();

        float Parallelogram_peri = 2*(a+b);

        System.out.println("Perimeter is: "+Parallelogram_peri);
    }
    public static void PerimeterOfRectangle(){
        System.out.println("Perimeter of Rectange");
        Scanner sc = new Scanner(System.in);
        int l,w;
        System.out.println("Enter length:");
        l=sc.nextInt();
        System.out.println("Enter width:");
        w=sc.nextInt();

        float Rec_Peri=2*(l+w);
        System.out.println("Perimeter is "+Rec_Peri);
    }
    public static void PerimeterOfSquare(){
        System.out.println("Perimeter of Square");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Side Length: ");
        int a=sc.nextInt();
        float sq_peri=4*a;

        System.out.println("Perimeter is: "+sq_peri);
    }
    
    public static void main(String[] args) {
        // PerimetersOfShapes obj = new PerimetersOfShapes();
        // obj.PerimeterOfCircle();
       PerimeterOfCircle();
       PerimeterOfEquilateralTriangle();
          PerimeterOfParallelogram();
        PerimeterOfRectangle();
        PerimeterOfCircle();

        
    
        
    }
}
