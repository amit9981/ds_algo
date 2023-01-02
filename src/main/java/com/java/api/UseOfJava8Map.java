package com.java.api;

import com.java.beans.Car;
import org.junit.Test;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class UseOfJava8Map {
    @Test
    public void MapUse() throws Exception {
        List<Car> cars = MockData.getCars();
        System.out.println(cars.stream().map(n -> n.getColor()).collect(Collectors.toList()));

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
}
