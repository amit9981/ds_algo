package com.java.api;

//import org.junit.Test;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

import com.java.beans.Car;
import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class DistinctAndSets {
    @Test
    public void distinct() {

        List<Integer> numbers = Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 9, 9, 9);
        List<Integer> distinct = numbers.stream().distinct().collect(Collectors.toList());
        assertThat(distinct).hasSize(9);
        System.out.println(distinct);
    }

    @Test
    public void distinctWithSet() {
        List<Integer> numbers = Arrays.asList(1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 9, 9, 9);
        Set<Integer> distinct = numbers.stream().collect(Collectors.toSet());
        assertThat(distinct).hasSize(9);
        System.out.println(distinct);
    }

    @Test
    public  void findCarPrice() throws IOException {
        MockData.getCars().stream().filter(p->p.getPrice()<10000).collect(Collectors.toList()).forEach(p-> System.out.println(p.getPrice()));
      //  assertThat(selectedCars).hasSize(57);

    }

    @Test
    public  void mapIterator() throws IOException {
        Map<Integer, String> namesMap = new HashMap<>();
        namesMap.put(1, "Larry");
        namesMap.put(2, "Steve");
        namesMap.put(3, "James");
        namesMap.forEach((key,val)-> System.out.println(key+"  " +val));
        System.out.println(namesMap.entrySet().stream().collect(Collectors.toList()));
    }

    @Test
    public  void mapSortByKey() throws IOException {
        Map<Integer, String> namesMap = new HashMap<>();
        namesMap.put(1, "Larry");
        namesMap.put(2, "Steve");
        namesMap.put(3, "James");
       // namesMap.forEach((key,val)-> System.out.println(key+"  " +val));
        System.out.println(namesMap.entrySet().stream().collect(Collectors.toList()));
    }
}
//how to iterate map
/* sort map by key and value
based on highest value find key
longest sub string
2nd highest sal emp name in java8

* */