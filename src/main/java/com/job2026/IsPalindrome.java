package com.job2026;

public class IsPalindrome {
    public static void main(String[] args) {
        int num = 121;
        isPalindrome(num);
        System.out.println(isPalindromeNormal(num));

    }
    public static boolean isPalindromeNormal(int num) {

        if (num < 0) {
            return false;
        }

        int original = num;
        int reverse = 0;

        while (num != 0) {
            int digit = num % 10;
            reverse = reverse * 10 + digit;
            num = num / 10;
        }

        return original == reverse;
    }

    public static boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) {
            return false;
        }

        int reversedHalf = 0;

        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10;
            x /= 10;
        }

        return x == reversedHalf || x == reversedHalf / 10;
    }
}
