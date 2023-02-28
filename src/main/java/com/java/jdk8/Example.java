package com.java.jdk8;

public class Example {
    public static void main(String[] args) {

        String str = "86423279847";
        String search = "327";
        System.out.println(count(str, search));
    }

    //find number string in string
    private static int count(String str, String search) {
        int count = 0;
        int index = str.indexOf(search);
        while (index != -1) {
            count++;
            index = str.indexOf(search, index + search.length());
        }
        return count;
    }
}
