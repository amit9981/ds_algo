package com.java.thread;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Demo {
    public static void main(String[] args) {

            ArrayList<String> list = new ArrayList<String>();
            list.add("banana");
            list.add("apple");
            Iterator itr = list.iterator();
            Collections.sort(list); //ConcurrentModificationException
            while (itr.hasNext()) {
                System.out.print(itr.next() + " ");
            }
        }
    }

