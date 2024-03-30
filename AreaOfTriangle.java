import java.util.Scanner;
public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the breadth Of Triangle:");
        float b=sc.nextFloat();
        System.out.println("Enter Length of the Triangle:");
        float l=sc.nextFloat();
        

        double area=0.5*(b*l);
        System.out.println("The Area of Triangle is:"+area);
   
    
}

}

   
