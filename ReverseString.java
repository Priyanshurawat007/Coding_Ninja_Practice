import java.util.*;

public class Solution {

    public static String reverseWords(String str) {
        String[] words = str.trim().split("\\s+");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ", words);
    }

    public static void main(String[] args) {
        String str = "Welcome to Coding Ninjas";
        System.out.println(reverseWords(str));
    }
}
