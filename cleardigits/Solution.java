package cleardigits;

public class Solution {
    public static String clearDigits(String s) {
        StringBuilder sb = new StringBuilder(s);

        // Continue until no more digits are found
        while (true) {
            int digitIndex = -1;

            // Find the first digit in the string
            for (int i = 0; i < sb.length(); i++) {
                if (Character.isDigit(sb.charAt(i))) {
                    digitIndex = i;
                    break;
                }
            }

            // If no digit is found, exit the loop
            if (digitIndex == -1) {
                break;
            }

            // Find the closest non-digit character to the left of the digit
            int leftNonDigitIndex = -1;
            for (int i = digitIndex - 1; i >= 0; i--) {
                if (!Character.isDigit(sb.charAt(i))) {
                    leftNonDigitIndex = i;
                    break;
                }
            }

            // If no non-digit character is found to the left, exit the loop
            if (leftNonDigitIndex == -1) {
                break;
            }

            // Remove the digit and the closest non-digit character to its left
            sb.deleteCharAt(digitIndex);
            sb.deleteCharAt(leftNonDigitIndex);
        }

        // Return the final string after all deletions
        return sb.toString();
    }

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "cb34";

        System.out.println(clearDigits(s1)); // Output: "abc"
        System.out.println(clearDigits(s2)); // Output: ""
    }
}