import java.util.Scanner;
public class Patterns {
    public static void NForest(int n){

        for(int i=1;i<=n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void Patterns2(int n){
        for(int i=0;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void Patterns3(int n){
        for (int i = 0; i <n; i++) {
            for(int j=0;j<n-i;j++){
                System.out.print("* ");

            }
            System.out.println();
        }
    }
    public static void Patterns4(int n){
        for(int i=0;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i <n; i++) {
            for(int j=1;j<n-i;j++){
                System.out.print("* ");

            }
            System.out.println();
        }
    }
    public static void Patterns5(int n){
        for(int i=1;i<=n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of Stars: ");
        int n=sc.nextInt();
        NForest(n);
        Patterns2(n);
        Patterns3(n);
        Patterns4(n);
        Patterns5(n);
    }
}
