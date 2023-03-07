package com.java.jdk8;

import com.java.api.MockData;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {
    public static void main(String[] args) throws IOException {
        String str = "86423279847";
        String search = "327";
        //  System.out.println(str.indexOf(search));
        int arr[] = {0, 1, 0, 1, 0, 0, 1};
        MockData.getPeople().stream().filter(p -> p.getAge() > 98).sorted((c1,c2)->c1.getId().compareTo(c2.getId()))
                .sorted((p1,p2)->p1.getFirstName().compareTo(p2.getFirstName()))
                .collect(Collectors.toList()).forEach(System.out::println);
        
        ArrayList al = Stream.builder().add("hi").add("hello").add("jw").add("sdjh").add("sd").build()
                .sorted(Collections.reverseOrder()).collect(Collectors.toCollection(ArrayList::new));
        //Collections.sort(al);
        System.out.println(al);

        Arrays.stream(arr).sorted().forEach(System.out::println);
    }

}
