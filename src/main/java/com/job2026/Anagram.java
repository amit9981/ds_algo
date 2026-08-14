package com.job2026;

import java.util.Arrays;
import java.util.Locale;

public class Anagram {
    public static void main(String[] args) {
       // System.out.println(isAnagram("AMIT","TIMA"));
        System.out.println(closeStrings("a","aa"));
    }
    public static boolean closeStrings(String word1, String word2) {
        char[] word1Ch=word1.toCharArray();
        char[] word2Ch=word2.toCharArray();
        int[] ch1=new int[26];
        int[] ch2=new int[26];
        for (char c:word1Ch) {
            ch1[c-'a']++;
        }
        for (char c:word2Ch) {
            ch2[c-'a']++;
        }
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1,ch2);
    }
    public static boolean isAnagram(String str1,String str2){
        boolean isAnagram=true;
        str1.toCharArray();
                int[] ansChar=new int[26];
        if(str1.length()!=str2.length()){
            isAnagram=false;
        }
        for (int i = 0; i <str1.length()&&i<str2.length() ; i++) {
            ansChar[str1.toLowerCase().charAt(i) - 'a']++;
            ansChar[str2.toLowerCase().charAt(i) - 'a']--;
        }
        for (int c:ansChar) {
            if (c!=0){
                isAnagram=false;
            }
        }
        System.out.println(Arrays.toString(ansChar));

        return isAnagram;
    }
}
