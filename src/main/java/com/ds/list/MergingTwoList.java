package com.ds.list;

import com.sun.xml.internal.ws.binding.FeatureListUtil;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Collections.*;

public class MergingTwoList {
    public static void main(String[] args) {
       // mergeTwoList();
        reverseListFromKthElement();
    }

    public static void reverseListInPair() {
        LinkedList l1 = new LinkedList();
        int k = 3;
        List<Integer> l2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        for (int i = 0; i < k; i++) {
            l1.addFirst(l2.get(i));
        }
        System.out.println("befour " + l1);
        for (int i = k; i < l2.size(); i++) {
            l1.add(l2.get(i));
        }
        System.out.println("After " + l1);
    }
    public static void reverseListFromKthElement() {
        LinkedList l1 = new LinkedList();
        int k = 3;
        List<Integer> l2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);
        for (int i = 0; i < k; i++) {
            l1.addFirst(l2.get(i));
        }
        System.out.println("befour " + l1);
        for (int i = k; i < l2.size(); i++) {
            l1.add(l2.get(i));
        }
        System.out.println("After " + l1);
    }

    public static void mergeTwoList() {
        List<Integer> l1 = Arrays.asList(1, 3, 5, 7);
        List<Integer> l2 = Arrays.asList(2, 4, 6, 7, 8);
        LinkedList l = new LinkedList();
        l.add(0);
        l.add(10);
        // Stream.concat(l1.stream(), l2.stream()).collect(Collectors.toList());
        // 1 Way
        List<Integer> finalResult = (List) Stream.concat(l1.stream(), l2.stream()).collect(Collectors.toList());
        System.out.println(finalResult);
        System.out.println(finalResult.stream().sorted().collect(Collectors.toList()));

        //2 Way
        System.out.println(Stream.of(l1, l2).flatMap(Collection
                ::stream).sorted().collect(Collectors.toList()));

        //3 way
        l.addFirst(1);
        l.addFirst(2);
        l.addLast(11);
        l.addAll(l1);
        Collections.sort(l);

        System.out.println((l));
    }
}
