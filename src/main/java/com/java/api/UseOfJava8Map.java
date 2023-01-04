package com.java.api;

import com.java.beans.Car;
import com.java.beans.Person;
import org.junit.Test;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

public class UseOfJava8Map {
    @Test
    public void MapUse() throws Exception {
        List<Car> cars = MockData.getCars();
        System.out.println(cars.stream().map(n -> n.getColor()).collect(toList()));

        // to set value is list of custom object
       /* List<Employee> l2=list.stream().map(t->{
                    t.setAge(t.getAge()*2);
                    return t;
                }
        ).collect(Collectors.toList());
        */
//or
//fruits.forEach(fruit -> fruit.setName(fruit.getName() + "s"));
    }
    @Test
    public void understandingCollect() throws Exception {
       // MockData.getCars().stream().map(Car::getColor).collect(toList()).forEach(System.out::println);
        //MockData.getPeople().stream().map(Person::getEmail).collect(toList()).forEach(System.out::println);


       /* List<String> emails = MockData.getPeople()
                .stream()
                .map(Person::getEmail)
                .collect(toList());

        emails.forEach(System.out::println);*/
    }

    @Test
    public void intermediateAndTerminalOperations() throws Exception {
       /* System.out.println(
                MockData.getCars()
                        .stream()
                        .filter(car -> {
                            System.out.println("filter car " + car);
                            return car.getPrice() < 10000;   //if condition full fill then it will collect in list
                        })
                        .map(car -> {
                            System.out.println("mapping car " + car);
                            return car.getPrice();  //it will print only car price whose value is less than 10000
                        })
                        *//*.map(price -> {
                            System.out.println("mapping price " + price);
                            return price + (price * .14);
                        })*//*
                        .collect(toList())
        );*/
      /*  Alternate way of filtering like above
        MockData.getCars().stream().filter(n->n.getPrice()<10000).collect(toList()).forEach(System.out::println);
 MockData.getCars().stream().filter(n->n.getPrice()<10000).map(n->n.getPrice()).collect(toList()).forEach(System.out::println);

       */
    }
}
