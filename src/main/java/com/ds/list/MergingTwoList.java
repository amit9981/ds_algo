package com.ds.list;


import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergingTwoList {
    public static void main(String[] args) {
        //mergeTwoList();
        // reverseListFromKthElement();
        alterNateList();
        //reverseListInPair();
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
        List<Integer> l2 = Arrays.asList(2, 4, 6, 7, 8, 9);
        LinkedList l = new LinkedList();
        ArrayList al = new ArrayList();
       // l.add(0);
        //l.add(10);
        // Stream.concat(l1.stream(), l2.stream()).collect(Collectors.toList());
        // 1 Way
        List<Integer> finalResult = (List) Stream.concat(l1.stream(), l2.stream()).collect(Collectors.toList());

        System.out.println(finalResult);
        System.out.println(finalResult.stream().sorted().collect(Collectors.toList()));

        //2 Way
        System.out.println(Stream.of(l1, l2).flatMap(Collection
                ::stream).sorted().collect(Collectors.toList()));
        /*
        List<Integer> l1 = Arrays.asList(1, 3, 5, 7);
        List<Integer> l2 = Arrays.asList(2,4,6,7, 8,9);
*/
        //3 way
        l.addFirst(1);
        l.addFirst(2);
        l.addLast(11);
        l.addAll(l1);
        Collections.sort(l);

        System.out.println((l));
    }
    public static void alterNateList(){
        List<Integer> l1 = Arrays.asList(1, 3, 5, 7);
        List<Integer> l2 = Arrays.asList(2, 4, 6, 8, 10);
        ArrayList al = new ArrayList();
        int i = 0, j = 0, k = 0;
        while (i < l1.size() && j < l2.size()) {
            al.add(k++, l1.get(i++));
            al.add(k++, l2.get(j++));

        }
        while (i < l1.size())
            al.add(k++, l1.get(i++));

        // Store remaining elements of second array
        while (j < l2.size()){
            al.add(k++, l2.get(j++));
        }
        System.out.println(" final aL " + al);
    }
}
