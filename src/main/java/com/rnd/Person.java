package com.rnd;

import java.util.*;

class Person {
    String name;
    Integer id;
    Person(String n, Integer i) { name=n; id=i; }
    Person(Integer i) {name=null; id=i;}
    @Override public String toString() { return name + " " + id; }
}

//Which of the following statements correctly describe java.util.Spliterator?
class PersonTest {
    static List<Person> people = Arrays.asList(
            new Person("Bob",1),new Person(2),new Person("Jane",3));
    static int x;
   /* public static void main(String[] args) {
        people.stream()
                .reduce((e1,e2) -> { x=e1.id; if (e1.id > e2.id) return e1; x=e2.id; return e2;})
                .flatMap(e -> Optional.ofNullable(e.name))
                .map(y -> new Person(y,x))
                .ifPresent(System.out::println);
    }*/
    @Override
    public String toString() {
        return "ObjectDemo";
    }
    public static void main(String[] args) {
        List<Map<List<Integer>, List<String>>> officeParametersList =
                                          new ArrayList<>();
                          Map<List<Integer>, List<String>> officeParamMap = new HashMap<>();
                          officeParametersList.add(null);
                          officeParametersList.add(officeParamMap);
                          officeParametersList.add(new HashMap<List<Integer>,
                                                                                    List<String>>());
                        officeParametersList.forEach(e -> System.out.print(e + " "));
    }
}
