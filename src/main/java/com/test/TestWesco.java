package com.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TestWesco {
    public static void main(String[] args) {
        //First program
        List<Integer> l = Arrays.asList(14, 23, 34, 65, 63, 87, 37);
        System.out.println(l.stream().filter(p -> (int) p / 10 == 6).collect(Collectors.toList()));
        //second program
        Set<Integer> set = l.stream().sorted((s1, s2) -> s2.compareTo(s1)).collect(Collectors.toSet());
        System.out.println(set.stream().max((s1, s2) -> s1.compareTo(s2)).get());
        set.stream().max((s1, s2) -> s1.compareTo(s2));
        //Third Program
        List l1 = Arrays.asList(14, 23, 34, 65, 63, 87, 37);
        List l2 = Arrays.asList(56, 76, 88, 14, 43, 65, 88);
        System.out.println(l1.stream().filter(p -> l2.contains(p)).collect(Collectors.toList()));
        System.out.println(l1.stream().filter(p -> !l2.contains(p)).collect(Collectors.toList()));


       /* List<String> listOne = // Your list1
                List<String> listTwo = // Your list2

                        List<String> uniqueElementsFromBothList = new ArrayList<>();
        List<String> commonElementsFromBothList = new ArrayList<>();

// Duplicate/Common elements from both lists
        commonElementsFromBothList.addAll(
                listOne.stream()
                        .filter(str -> listTwo.contains(str))
                        .collect(Collectors.toList()));

// Unique element from listOne
        uniqueElementsFromBothList.addAll(
                listOne.stream()
                        .filter(str -> !listTwo.contains(str))
                        .collect(Collectors.toList()));

// Unique element from listOne and listTwo
// Here adding unique elements of listTwo in existing unique elements list (i.e. unique from listOne)
        uniqueElementsFromBothList.addAll(
                listTwo.stream()
                        .filter(str -> !listOne.contains(str))
                        .collect(Collectors.toList()));*/
    }
}
