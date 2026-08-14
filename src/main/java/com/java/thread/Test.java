package com.java.thread;

import lombok.Data;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    /*public static void main(String[] args){ {

        List<Employee> employees = Arrays.asList(
                new Employee("John", 50000),
                new Employee("Amit", 70000),
                new Employee("Rahul", 50000),
                new Employee("David", 60000),
                new Employee("Ankit", 70000)
        );

        List<Employee> sorted = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary)
                        .thenComparing(Employee::getName))
                .collect(Collectors.toList());

        sorted.forEach(System.out::println);
    }*/
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee("John", 50000),
                new Employee("Amit", 70000),
                new Employee("Rahul", 50000),
                new Employee("David", 60000),
                new Employee("Ankit", 70000));
        employeeList.sort(
                Comparator.comparing(Employee::getName)
                       // .thenComparing(Employee::getName)
        );
        System.out.println("with "+employeeList);
        // System.out.println(employeeList.stream().sorted().filter((e2)->e2.getSalary()> emp1.getSalary()).collect(Collectors.toList()));
        System.out.println(employeeList.stream().mapToInt(Employee::getSalary).max().orElse(0));
        System.out.println(employeeList.stream().
                filter(s -> s.getSalary() == employeeList.stream().mapToInt(Employee::getSalary).max().orElse(0))
                .toList());
      System.out.println(employeeList.stream().sorted(Comparator.comparing(Employee::getSalary)
                .reversed()
                .thenComparing(Employee::getName)).collect(Collectors.toList()));
        List<Employee> sorted = employeeList.stream()
                .sorted(Comparator.comparing(Employee::getSalary)
                        .thenComparing(Employee::getName))
                .collect(Collectors.toList());
        System.out.println(sorted);

        sorted.forEach(System.out::println);
        System.out.println(employeeList.stream()
                .map(Employee::getSalary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .collect(Collectors.toList()));

    }

}
@Data
class Employee {
    public String name;
    public int salary;

    public Employee(String name, int salary) {
        this.name=name;
        this.salary=salary;
    }

    public Employee() {

    }
}
