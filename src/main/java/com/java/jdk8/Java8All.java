package com.java.jdk8;

import org.junit.Test;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8All {
    public static void main(String[] args) {
        getRandom();
        List<Integer> numbers = Arrays.asList(11, 20, 33, 45, 52);
        int sum = numbers.stream()
                .filter(n -> n % 4 == 0) //filter val which divisible by 4
                .map(n -> n * 2)  //multiply by 2
                .reduce(0, Integer::sum); //sum
        System.out.println(sum);

        Stream.of(1, 2, 3)
                .flatMap(n -> Stream.of(n, n * 2))
                .forEach(System.out::print);
        Stream.of(1).count();

        List<String> words = Arrays.asList("hello", "world");
        List<String> letters = words.stream()
                .flatMap(s -> Stream.of(s.split("")))
                .collect(Collectors.toList());
        System.out.println("letter "+letters);
        System.out.println(letters.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));
        System.out.println("dup "+ letters.stream().filter(i->Collections.frequency(letters, i)<2 ).collect(Collectors.toList()));

        Optional<Integer> result = numbers.stream()
                .filter(n -> n > 25)
                .reduce((a, b) -> a + b);
        System.out.println(result);
    }
    public static void sortBasedOnValue(){
        Map<String, Integer> hm = new HashMap();
        hm.put("a", 2);
        hm.put("c", 1);
        hm.put("b", 3);
        LinkedHashMap lhm = hm.entrySet().stream().
                sorted((e1, e2) -> e1.getValue().compareTo(e2.getValue())).
                        collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (c1, c2) -> c1, LinkedHashMap::new));
       /* LinkedHashMap lhm = hm.entrySet().stream().sorted((e1, e2) -> {
                    return e1.getValue() - e2.getValue();
        }).
                collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (c1, c2) -> c1, LinkedHashMap::new));*/
        System.out.println(lhm);
    }
    public static void getPersionAgeWithFilter() {
        Map<String, Integer> ages = new HashMap<>();
        ages.put("Robert", 30);
        ages.put("Mary", 25);
        ages.put("Peterson", 40);
        ages.put("Jinny", 35);

        int result = ages.entrySet().stream()
                .filter(entry -> entry.getValue() > 30)
                .mapToInt(entry -> entry.getValue())
                .sum();
        System.out.println(result);
        System.out.println(ages.entrySet().stream()
                .filter(entry -> entry.getValue() > 30).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue)));
    }

    public static void getRandom() {

        Random random = new Random();
        //Stream<Integer> stream =
                Stream.generate(
                        () -> {
                            return random.nextInt(10);
                        } // generating random numbers between 0 and 99
                ).limit(5).forEach(System.out::println);
                Stream.builder().add(1).add(4).add(2).build().collect(Collectors.toList()).stream().forEach(n-> System.out.print(n+ " "));
    }
}
