package com.java.jdk9;

import org.junit.Test;

import java.util.List;
import java.util.Set;

public class ListOf {

    @Test
    public void testOf(){
        List<String> ll=List.of("Amit","Sumit","Mohit","Harry");
        Set sl=Set.of("Harry","Amit","Mohit");
         sl=Set.copyOf(ll);
var str=;
        System.out.println(sl);
    }
}
