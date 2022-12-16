package com.java.jdk9;

import com.google.common.collect.ImmutableList;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class ImmutableListTest {
    public static void main(String[] args) {

    }

    @Test
    public void googleImmutableList() {
        List<String> list = new ArrayList<>();
        list.add("Geeks");
        // Create ImmutableList from List using copyOf() from google lib
        ImmutableList<String> iList = ImmutableList.copyOf(list);
        // We change List and the changes wont reflect in iList.
        list.add("For");
        list.add("Geeks");
        System.out.println(iList);
    }

    @Test
    public void immutableListWithUnmodifiableMethod() {
        List<String> list = new ArrayList<>();
        list.add("Geeks");
        List<String> iList = Collections.unmodifiableList(list);

        // We change List and the changes reflect in iList.
        list.add("For");
        list.add("Geeks");
        //  iList.add("hi");  java.lang.UnsupportedOperationException
        System.out.println(iList);
        System.out.println(list);
    }

    @Test
    public void immutableListWithJava9_of() {
        List immutableList = List.of();
        List immutableListNonEmpty = List.of("one", "two", "three");

        //The Map has two sets of methods: of() methods and ofEntries() methods to create an Immutable Map object and an Immutable Map.Entry object respectively. Empty Map Example
        Map nonemptyImmutableMap = Map.of(1, "one", 2, "two", 3, "three");
        System.out.println(nonemptyImmutableMap);
        nonemptyImmutableMap.forEach((key, val) -> System.out.println(key + " " + val));
    }
}
