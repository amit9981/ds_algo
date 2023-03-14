package com.java.thread;

import java.util.*;
import java.util.regex.Pattern;

public class Demo {
    public static void main(String[] args) {

            ArrayList<String> list = new ArrayList<String>();
            list.add("banana");
            list.add("apple");
            Iterator itr = list.iterator();
            //Collections.sort(list); //ConcurrentModificationException
            while (itr.hasNext()) {
                System.out.print(itr.next() + " ");
            }
        List<Integer> list1 = new ArrayList<>();
        list1.add(5);

        List<Map<Integer, Pattern>> newList =  (List) list;
        newList.add(new HashMap<>());
        newList.get(0);
        newList.get(1);
        System.out.println("newList"+newList);
    }
    }

