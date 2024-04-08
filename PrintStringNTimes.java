import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintStringNTimes {
    public static List<String> printNtimes(int n) {
        List<String> resultList = new ArrayList<>();
        String str = "Coding Ninjas ";
        
        for (int i = 0; i < n; i++) {
            resultList.add(str);
        }
        
        return resultList;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> output = printNtimes(n);
        
        for (String str : output) {
            System.out.print(str);
        }
    }
}
