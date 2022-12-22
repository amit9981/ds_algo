package com.java.jdk8;

import com.java.api.MockData;
import com.java.beans.Car;
import com.java.beans.Person;
import org.junit.Test;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class GroupingData {
    @Test
    public void simpleGrouping() throws Exception {
        Map map=MockData.getPeople().stream().collect(Collectors.groupingBy(Person::getGender));
        //System.out.println(map);
//map.forEach((k,v)-> System.out.println(k));
    /*    Map<String, List<Car>> map = MockData.getCars()
                .stream()
                .collect(Collectors.groupingBy(Car::getColor));
        map.forEach((s, cars) -> {
            System.out.println("Make " + s);
            cars.forEach(System.out::println);
            System.out.println("---------------------");
        });*/
      //  System.out.println(MockData.getCars().stream().collect(Collectors.groupingBy(Car::getColor)));

    }

    @Test
    public void groupingAndCounting() {
        List<String> names = List.of(
                "John",
                "John",
                "Mariam",
                "Alex",
                "Mohammado",
                "Mohammado",
                "Vincent",
                "Alex",
                "Alex"
        );

        Map<String, Long> map = names.stream()
                .collect(Collectors.groupingBy(
                        Function.identity(),
                        Collectors.counting())
                );

        System.out.println(map);

    }

}

