package com.job2026.leet75;

import java.util.Arrays;

public class StringCompressTwoPointer {
    public int compress(char[] chars) {

        int write = 0;
        int read = 0;
        while (read < chars.length) {
            char current = chars[read];
            int count = 0;
            while (read < chars.length && chars[read] == current) {
                read++;
                count++;
            }
            chars[write++] = current;
            if (count > 1) {
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[write++] = c;
                }
            }
        }
        return write;
    }

    public static void main(String[] args) {

        StringCompressTwoPointer obj = new StringCompressTwoPointer();

        char[] chars = {'a', 'a', 'b', 'b', 'c', 'c', 'c' };

        int length = obj.compress(chars);

        System.out.println("Length = " + length);

        System.out.println(Arrays.toString(chars));
        for (int i = 0; i < length; i++) {
            System.out.print(chars[i] + ",");
        }
    }
}
