import java.util.* ;
import java.io.*; 
public class Solution {
	
	public static String IsFriend(String s1, String s2)
	{
		   Set<Character> sweetsS1 = new HashSet<>();
        Set<Character> sweetsS2 = new HashSet<>();
        
        // Add sweets to the set for Ninja S1
        for (char ch : s1.toCharArray()) {
            sweetsS1.add(ch);
        }
        
        // Add sweets to the set for Ninja S2
        for (char ch : s2.toCharArray()) {
            sweetsS2.add(ch);
        }
        
        // Check for common sweets
        for (char ch : sweetsS1) {
            if (sweetsS2.contains(ch)) {
                return "Yes";
            }
        }
        
        return "No";
    }

}
