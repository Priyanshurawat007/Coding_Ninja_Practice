import java.util.* ;
import java.io.*; 
public class Solution {	
	public static String reverseString(String str) {
	 char[] chars = str.toCharArray(); // Convert string to char array
        int left = 0; // Pointer for the beginning of the string
        int right = chars.length - 1; // Pointer for the end of the string
        
        while (left < right) {
            // Swap characters at left and right pointers
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            // Move pointers towards the middle of the string
            left++;
            right--;
        }
        
        return new String(chars); // Convert char array back to string
    }
}
