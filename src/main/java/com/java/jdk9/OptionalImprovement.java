package com.java.jdk9;

import com.java.api.MockData;
import com.java.beans.Person;

import java.io.IOException;
import java.util.Optional;
import java.util.stream.Stream;

public class OptionalImprovement {
    public static void main(String[] args) throws IOException {
        Stream<Optional> emp =  Stream.of(Optional.of(MockData.getPeople()));
        Stream empStream = emp.flatMap(Optional::stream);
        System.out.println(empStream);

    }


}
