package com.job2026.leet75;

public class GCM {
    public static void main(String[] args) {
        System.out.println(gcdOfStrings("LEET","CODE"));
    }
    public static String gcdOfStrings(String str1, String str2) {

        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }

        int len = gcd(str1.length(), str2.length());

        return str1.substring(0, len);
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
