package com.rnd;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateWordsInJava8 {
    public static void main(String[] args) {
        String str="I am Amit. I live in India";
        String[] strArr=str.split(" ");
        HashMap hm=new HashMap();
        List ll=Arrays.asList('a','b','c','a','c');
    //ll.stream().filter(company -> Collections.frequency(ll, company) > 1).collect(Collectors.toList());
      //  System.out.println(ll.stream().filter(company -> Collections.frequency(ll, company) > 1).collect(Collectors.toMap(Function.identity(),Function.)));
    }
}
