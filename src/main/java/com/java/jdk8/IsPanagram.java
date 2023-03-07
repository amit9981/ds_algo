package com.java.jdk8;

import java.util.*;
import java.util.stream.Collectors;

public class IsPanagram {
    public static void main(String[] args) {
        String str = "The quick brown fox jumps over the lazy 1og";
        System.out.println(testIsAnagram());
        System.out.println(testWithIndex(str));
        System.out.println(testIsPanagram(str));
    }

    private static boolean testIsAnagram() {
        String str1 = "Race";
        String str2 = "Care";
        return Arrays.stream(str1.toLowerCase().split("")).collect(Collectors.toSet())
                .equals(Arrays.stream(str2.toLowerCase().split("")).collect(Collectors.toSet()));

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
