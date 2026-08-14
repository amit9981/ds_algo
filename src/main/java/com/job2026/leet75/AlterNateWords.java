package com.job2026.leet75;

public class AlterNateWords<w2> {
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "dedefg";

        StringBuilder sb = new StringBuilder();
        int w1 = word1.length();
        int w2 = word2.length();
        int i = 0;
        int j=0;

        while (w1 > 0 && w2 > 0) {
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(j));
            w1--;
            w2--;
            i++;j++;
        }
        while(w1>0){
            sb.append(word1.charAt(i));
            w1--;
            i++;
        }
        while(w2>0){
            sb.append(word2.charAt(j));
            j++;
            w2--;
        }
        System.out.println("StringBuilder:: "+sb.toString());
    }
}

