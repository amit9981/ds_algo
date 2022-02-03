package com.test;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        System.out.println("Hello : "+isValidSubsequence(Arrays.asList(1,2,3,7,5),Arrays.asList(7,3)));

    }
    public static boolean isValidSubsequence(List<Integer> array, List<Integer> sequence) {
        HashSet<Integer> value=new HashSet<Integer>();
        boolean b = false;
        value.addAll(sequence);
        int p=0,n;
        for (int j = 0; j <sequence.size() ; j++) {
            for (int i = 0; i < array.size(); i++) {
                System.out.println(i);
                if(array.get(i) == sequence.get(j)){
                    b=true;
                }
                }
                //return b;


            }

        return b;
    }
}
