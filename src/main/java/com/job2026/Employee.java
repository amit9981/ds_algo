package com.job2026;

import lombok.Data;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Employee
{
      String name;
      int age;

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
        public String toString(){
        return name+": "+age;
    }


    public static void main(String[] args) {
        List<Employee>employeeList= Arrays.asList(
                new Employee("Amit",21),
                new Employee("Sumit",20),
                new Employee("Rahul",22)
        );
        System.out.println(employeeList);
        //employeeList.stream().sorted(Comparator.)
        System.out.println(employeeList.stream().sorted(Comparator.comparingInt((Employee e)->e.age)).collect(Collectors.toList()));
        System.out.println(employeeList.stream().sorted(Comparator.comparing((Employee e)->e.name).reversed()).collect(Collectors.toList()));

    }
}
