package com.ds.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseLinkedListInPair {
    public static void main(String[] args) {
        List al = Stream.builder().add(1).add(2).add(3).add(4).add(5).add(6).build().collect(Collectors.toList());
        System.out.println(al);
        LinkedList ll = new LinkedList();
        for (int i = 1; i < al.size(); i+=2) {
            for (int j = i; j >i-2; j--) {
                ll.add(al.get(j));

            }
        }

        System.out.println(ll);
    }
}
