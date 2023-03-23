package com.ds.string;

import java.util.*;
import java.util.stream.Collectors;

public class ReverseString {
    public static void main(String[] args) {
        String str = "This is India";
        if(str.contains(" ")) {
            System.out.println(wordByWordReverse(str));
        }else {
            System.out.println(charByCharReverse("Amit"));
        }
    }

    private static String wordByWordReverse(String str) {
        LinkedList<String> ll = Arrays.stream(str.split(" ")).collect(Collectors.toCollection(LinkedList::new));
        LinkedList<String> resultList = new LinkedList();
        for (String s :
                ll) {
            resultList.addFirst(s);
        }
        return resultList.toString();
    }

    private static String charByCharReverse(String str) {
        LinkedList<String> ll = Arrays.stream(str.split("")).collect(Collectors.toCollection(LinkedList::new));
        LinkedList resultList = new LinkedList();
        for (String al :
                ll) {
            resultList.addFirst(al);
        }
        return resultList.toString();
    }
}
