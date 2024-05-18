import java.util.* ;
import java.io.*; 
class Solution {
	
	 public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Basic salary and grade
        // System.out.print("Enter the basic salary: ");
        int basicSalary = scanner.nextInt();
        // System.out.print("Enter the grade (A/B/C): ");
        char grade = scanner.next().charAt(0);

        // Calculate hra, da, allow, and pf
        double hra = 0.20 * basicSalary;
        double da = 0.50 * basicSalary;
        double pf = 0.11 * basicSalary;
        double allow;

        switch (grade) {
            case 'A':
                allow = 1700;
                break;
            case 'B':
                allow = 1500;
                break;
            default:
                allow = 1300;
        }

        // Calculate total salary
        double totalSalary = basicSalary + hra + da + allow - pf;

        // Round off to the nearest integer
        int roundedSalary = (int) Math.round(totalSalary);

        // Output the integral part of the rounded salary
        System.out.println( roundedSalary);

        scanner.close();
    }
}
