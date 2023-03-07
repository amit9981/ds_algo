package com.java.jdk8;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class SortHashMapByValue {

    public static void main(String[] args) {
        getPersionAgeWithFilter();
        sortBasedOnValue();
    }

    public static void getPersionAgeWithFilter() {
        Map<String, Integer> ages = new HashMap<>();
        ages.put("Robert", 30);
        ages.put("Mary", 25);
        ages.put("Peterson", 40);
        ages.put("Jinny", 35);

        int result = ages.entrySet().stream()
                .filter(entry -> entry.getValue() > 30)
                .mapToInt(entry -> entry.getValue())
                .sum();
        System.out.println(result);

        System.out.println(ages.entrySet().stream()
                .filter(entry -> entry.getValue() > 30).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue)));
        /* How to use comparingByKey()
        System.out.println(ages.entrySet().stream()
                .filter(entry -> entry.getValue() > 30).collect(Collectors.toMap(Map.Entry.comparingByKey().reversed())).;*/
    }
    public static void sortBasedOnValue(){
        Map<String, Integer> hm = new HashMap();
        hm.put("a", 2);
        hm.put("c", 1);
        hm.put("b", 3);
        LinkedHashMap lhm = hm.entrySet().stream().
                //sorted((e1, e2) -> e1.getValue().compareTo(e2.getValue())).
                collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (c1, c2) -> c1, LinkedHashMap::new));
       /* LinkedHashMap lhm = hm.entrySet().stream().sorted((e1, e2) -> {
                    return e1.getValue() - e2.getValue();
        }).
                collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (c1, c2) -> c1, LinkedHashMap::new));*/
        System.out.println(lhm);
    }
}

