package com.rnd;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateWordsInJava8 {
    public static void main(String[] args) {
        String str = "I am Amit. I live in India";
        String[] strArr = str.split(" ");
        HashMap hm = new HashMap();
        List ll = Arrays.asList('a', 'b', 'c', 'a', 'c');

        System.out.println(ll.stream().filter(company -> Collections.frequency(ll, company) > 1).collect(Collectors.toList()));
        // 2. get duplicate count using Map and Collectors.toMap()
        //Map<String, Integer> duplicateCountMap = Arrays
        System.out.println(  ll.stream()
                .collect(
                        Collectors.toMap(Function.identity(), company -> 1, Math::addExact)
                ));
        System.out.println(ll.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));

          //System.out.println(ll.stream().filter(company -> Collections.frequency(ll, company) > 1).collect(Collectors.toMap(Function.identity(),Function.identity())));
    }
}
