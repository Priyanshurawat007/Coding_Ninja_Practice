public class Solution {

    public String reverseWords(String str) {
        // Split the string into words using whitespace as delimiter
        String[] words = str.trim().split("\\s+");

        // Initialize a StringBuilder to build the reversed string
        StringBuilder reversed = new StringBuilder();

        // Append words to the StringBuilder in reverse order
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) {
                reversed.append(" "); // Append a single space between words
            }
        }

        // Convert StringBuilder to string and return
        return reversed.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test cases
        String str1 = "Welcome to Coding Ninjas";
        String str2 = "  Hello  World  ";
        String str3 = "   ";

        System.out.println("Reversed string for \"" + str1 + "\": " + solution.reverseWords(str1));
        System.out.println("Reversed string for \"" + str2 + "\": " + solution.reverseWords(str2));
        System.out.println("Reversed string for \"" + str3 + "\": " + solution.reverseWords(str3));
    }
}
