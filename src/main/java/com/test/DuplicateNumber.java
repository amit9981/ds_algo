package com.test;

import java.util.HashMap;

public class DuplicateNumber {
    public static void main(String[] args) {
        String str="abrade";
        HashMap<Character,Integer> hm=new HashMap();
        char array[]=str.toCharArray();
        for (char ch:
             array) {
            if(!hm.containsKey(ch))
            hm.put(ch,1);
            else{
                hm.put(ch,hm.get(ch)+1);
            }
        }
        System.out.println(hm );
    }
}
