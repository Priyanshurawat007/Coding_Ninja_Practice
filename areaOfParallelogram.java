import java.util.Scanner;;
public class areaOfParallelogram {
    public static void main(String[] args) {
        int base,hieght;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Base of Parallelogram : ");
        base=sc.nextInt();
        System.out.println("Enter the hieght of Parallelogram:");
        hieght=sc.nextInt();
        double Area = base*hieght;

        System.out.println("Area is:"+Area);
    }
}
