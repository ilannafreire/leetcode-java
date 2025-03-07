package palindromenumber;

public class Solution {
    public static boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }


        int divisor = 1;
        while (x / divisor >= 10) {
            divisor *= 10;
        }


        while (x != 0) {
            int firstDigit = x / divisor;
            int lastDigit = x % 10;

            if (firstDigit != lastDigit) {
                return false;
            }


            x = (x % divisor) / 10;
            divisor /= 100;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(7));
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));
        System.out.println(isPalindrome(123456));
        System.out.println(isPalindrome(1221));
        System.out.println(isPalindrome(12321));

    }
}


