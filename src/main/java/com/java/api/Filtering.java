package com.java.api;

import com.java.beans.Car;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;
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
        System.out.println("new");
        Stream.of(1, 2, 6, 5).takeWhile(n -> n > 3).forEach(System.out::println);
        System.out.println();
        System.out.println("using take while");
        Stream.of(2, 4, 6, 8, 9, 10, 12).takeWhile(n -> n % 2 == 0)
                .forEach(n -> System.out.print(n + " "));
        Stream<Integer> unorderedList = Stream.of(2, 5, 7, 18, 12, 6, 2, 1, 16, 51);
        unorderedList.takeWhile(n -> n % 2 == 0).forEach(System.out::println);
    }

    @Test
    public void MyInterface2() {
        ToDoubleFunction<String> length = x -> x.length();
        System.out.println(length.applyAsDouble("This is an example of predefined functional interface."));
    }

    @Test
    public void findFirst() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int result = Arrays.stream(numbers).filter(n -> n == 50)
                .findFirst()
                .orElse(-1);
        System.out.println(result);

    }

    @Test
    public void findAny() {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 9, 10};
        int result = Arrays.stream(numbers).filter(Filtering::test) //(n->n==9)
                .findAny()
                .orElse(-1);
        System.out.println(result);
    }

    @Test
    public void allMatch() {
        int[] even = {2, 4, 6, 8, 1, 10};
        boolean allMatch = Arrays.stream(even).allMatch(n -> n % 2 == 0);
        System.out.println(allMatch);
    }

    @Test
    public void anyMatch() {
        int[] evenAndOneOdd = {2, 4, 6, 8, 10, 11};
        boolean anyMatch = Arrays.stream(evenAndOneOdd).anyMatch(n -> !(n % 2 == 0));
        System.out.println(anyMatch);
    }

    private static boolean test(int n) {
        return n == 9;
    }


}
