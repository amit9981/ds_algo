package com.java.jdk9;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ListOf {

    @Test
    public void testOf() {
        List<String> ll = List.of("Amit", "Sumit", "Mohit", "Harry");
        Set sl = Set.of("Harry", "Amit", "Mohit");
        sl = Set.copyOf(ll);
//var str=;
        System.out.println(sl);
    }

    @Test
    public void testOfList() {
        List<String> ll = List.of("Amit", "Sumit", "Mohit", "Harry");
       // ll.add("jh");
        ArrayList al=new ArrayList();
        //al.add()
        System.out.println(ll);
    }

}
