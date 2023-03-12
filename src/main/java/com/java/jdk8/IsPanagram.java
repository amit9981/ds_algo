package com.java.jdk8;

import java.util.*;
import java.util.stream.Collectors;

public class IsPanagram {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy 1og";
        System.out.println(testIsAnagram());
        //System.out.println(testWithIndex(str));
        // System.out.println(testIsPanagram(str));
    }

    private static boolean testIsAnagram() {

       /* Arrays.stream(str1.toLowerCase().split("")).collect(Collectors.toSet())
                .equals(Arrays.stream(str2.toLowerCase().split("")).collect(Collectors.toSet()));*/
        boolean isAna=true;
        String str1 = "race";
        String str2 = "care";
        int[] isAna1 = new int[265];
        int[] isAna2 = new int[265];
        if (str1.length() != str1.length()) {
            isAna=false;
        }
        if (str1.length() == str1.length()) {
            for (int i = 0; i < str1.length() && i < str2.length(); i++) {
                isAna1[str1.charAt(i)]++;
                isAna2[str2.charAt(i)]++;

            }
            System.out.println(Arrays.stream(isAna1).boxed().collect(Collectors.toList()).equals(Arrays.stream(isAna2).boxed().collect(Collectors.toList())));

            for (int i = 0; i < isAna1.length; i++) {
                if (isAna1[i] != isAna2[i]) {
                    //System.out.println("str1 " + isAna1[i]);
                    isAna=false;
                   // System.out.println("str2 " + isAna2[i]);
                }
            }
        }
        return isAna;

    }

    private static boolean testWithIndex(String str) {
        boolean isPanaGram = true;
        boolean[] alphaList = new boolean[26];
        int index = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                index = str.charAt(i) - 'A';
            } else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                index = str.charAt(i) - 'a';
            }
            alphaList[index] = true;
        }
        for (int i = 0; i <= 25; i++) {
            if (alphaList[i] != true)
                isPanaGram = false;
        }
        return isPanaGram;
    }

    private static boolean testIsPanagram(String str) {
        boolean isPanagram = false;
        Set l = Arrays.stream(str.toLowerCase().split(" ")).map(s -> s.split("")).collect(Collectors.toSet());
        System.out.println(l);
        if (l.size() == 26) {
            isPanagram = true;
        }
        return isPanagram;
    }
}
