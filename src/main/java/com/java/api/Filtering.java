package com.java.api;

import com.java.beans.Car;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Filtering {
    @Test
    public void filter() throws Exception {
        List<Car> cars = MockData.getCars();

        cars.stream()
                .filter(p -> p.getPrice() > 5000)
                .filter(p -> p.getColor().equalsIgnoreCase("Yellow"))
                .collect(Collectors.toList())
                .forEach(System.out::println);
        Predicate<Car> pricePredicate = p -> p.getPrice() > 5000;
        Predicate<Car> colorPredicate = p -> p.getColor().equalsIgnoreCase("green");
        cars.stream().filter(pricePredicate).filter(colorPredicate).collect(Collectors.toList()).forEach(System.out::println);

    }

    @Test
    public void dropWhile() {
        System.out.println("using filter");

        Stream.of(2, 4, 6, 7, 9, 10, 12).filter(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + " "));
        System.out.println();
        System.out.println("using dropWhile");
        Stream.of(2, 4, 6, 7, 9, 10, 12).dropWhile(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + " "));
        System.out.println();
        Stream<Integer> unorderedList = Stream.of(31, 5, 7, 18, 12, 6, 2, 1, 16, 51);
        unorderedList.dropWhile(num -> num < 10).forEach(num -> System.out.print(num + " "));

    }

    @Test
    public void takeWhile() {
        // using filter
        System.out.println("using filter");
        Stream.of(2, 4, 6, 8, 9, 10, 12).filter(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + " "));

        System.out.println();
        System.out.println("using take while");
        Stream.of(2, 4, 6, 8, 9, 10, 12).takeWhile(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + " "));
        Stream<Integer> unorderedList = Stream.of(2, 5, 7, 18, 12, 6, 2, 1, 16, 51);
        unorderedList.takeWhile(n -> n % 2 == 0).forEach(System.out::println);
    }
}
