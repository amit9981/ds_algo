package com.java.jdk8;

import java.util.LinkedHashMap;
import java.util.Map;

class MaxRepeatedChar1 {

    public static void main(String[] args) {
        //System.out.println("Hello World");
        System.out.println(charMax("HelloWorld"));
    }

    private static String charMax(String str) {

        Map<Character, Integer> map = new LinkedHashMap<>();
        char[] ch = str.toCharArray();

        for (char c : ch) {
            map.merge(c, 1, Integer::sum);
        }

        char rs = ' ';
        int val = 0;

        for (Map.Entry<Character, Integer> ff : map.entrySet()) {
            if (ff.getValue() > val) {
                val = ff.getValue();
                rs = ff.getKey();
            }
        }
        System.out.println(map);
        return rs+"  ==  "+val;

    }
}