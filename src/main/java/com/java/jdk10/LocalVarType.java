package com.java.jdk10;

import com.java.beans.Person;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

public class LocalVarType {

    /*Old type before java 10*/
    @Test
    public void explicitTypes() {
        Person Roland = new Person(1, "Roland", "Deschain", "Atest@gmail.com", "M", 21);
        Person Susan = new Person(2, "Susan", "Delgado", "Atest@gmail.com", "M", 21);
        Person Eddie = new Person(3, "Eddie", "Dean", "Atest@gmail.com", "M", 21);
        Person Detta = new Person(4, "Detta", "Walker", "Atest@gmail.com", "M", 21);
        Person Jake = new Person(5, "Jake", "Chambers", "Atest@gmail.com", "M", 21);

        List<Person> persons =
                List.of(Roland, Susan, Eddie, Detta, Jake);

        for (Person person : persons) {
            System.out.println(person.getFirstName() + " - " + person.getLastName());
        }
    }

    /*
        new java 10 Implicit Type Var
    */
    @Test
    public void varTypes() {
        var Roland = new Person(1, "Roland", "Deschain", "Atest@gmail.com", "M", 21);
        var Susan = new Person(2, "Susan", "Delgado", "Atest@gmail.com", "M", 21);
        var Eddie = new Person(3, "Eddie", "Dean", "Atest@gmail.com", "M", 21);
        var Detta = new Person(4, "Detta", "Walker", "Atest@gmail.com", "M", 21);
        var Jake = new Person(5, "Jake", "Chambers", "Atest@gmail.com", "M", 21);

        var persons = List.of(Roland, Susan, Eddie, Detta, Jake);

        persons.stream().map(Person::getId).forEach(System.out::println);
        // persons.stream().map(Person::getId).forEach(n->System.out.println(n));

        // System.out.println(l);

/*
        using lambda
        List l=persons.stream().map(Person::getAge).collect(Collectors.toList());
*/


        /*for (var person : persons) {
            System.out.println(person.getFirstName() + " - " + person.getLastName());
        }*/
    }
}
