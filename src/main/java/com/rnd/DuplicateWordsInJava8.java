package com.rnd;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateWordsInJava8 {
    public static void main(String[] args) {
        String str = "I am Amit. I live in India";
        String str1="HelloAmitHi";
        //duplicateWithMap(str1);
        String[] strArr = str.split(" ");
        //HashMap hm = new HashMap();
        List ll = Arrays.asList('a', 'b', 'c', 'a', 'c');

        System.out.println(ll.stream().filter(company -> Collections.frequency(ll, company) > 1).collect(Collectors.toList()));
        // 2. get duplicate count using Map and Collectors.toMap()
        //Map<String, Integer> duplicateCountMap = Arrays
        System.out.println(ll.stream().collect(Collectors.toMap(Function.identity(), company -> 1, Math::addExact)));
        System.out.println(ll.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting())));
        System.out.println("my "+Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));
        //System.out.println(ll.stream().filter(company -> Collections.frequency(ll, company) > 1).collect(Collectors.toMap(Function.identity(),Function.identity())));
    }
    public static void duplicateWithMap(String str){
        HashMap<Character,Integer> hm=new HashMap();
        for (int i = 0; i < str.length(); i++) {
            char ch=str.toLowerCase().charAt(i);
            if(hm.containsKey(ch)){
                hm.put(ch,(hm.get(ch))+1);
            }else{
                hm.put(ch,1);
            }
        }
        Stream.of(hm).map(p->p.size()).collect(Collectors.toList()).forEach(System.out::println);
        Stream.of(hm).map(p->p.keySet()).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println(" ");
        Stream.of(hm.entrySet()).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println(hm);

    }
}
