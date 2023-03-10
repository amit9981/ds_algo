package com.java.jdk8;

import java.util.Date;
import java.util.function.Consumer;
import java.util.function.Supplier;
/*onsumer :  It will consume Item. Consumers never return anything (never supply), they just consume.

Consumer Chaining :
We can combine / chain multiple consumers together with andThen .

There is only one ways to combine consumers:
 c1.andThen(c2).apply(Input);  - first c1 then c2

No compose() in consumer.

Multiple consumers can be chained together like :
c1.andThen(c2).andThen(c3).andThen(c4).apply(Inputs);

Supplier :
It will just supply required objects and will not take any input
Its always going to supply never consume / take any input.

EG : always supply me current date.
No chaining as no input is given to this. Only it gives u output.


Advantages:
Write once, use anywhere.

Code Reusability

BiCinsumer Bisupplier :
 What if we need 2 arguments for operation?

Then we need Bi XYZ Functional Interfaces.


There is no input in supplier so no 1 or 2 Input arguments needed. Hence no BiSupplier.

Q) If we want to operate on 3 arguments then triPredicate?

There are no TriPredicate or TriFunction etc.

No QuadPredicate No QuadFunction.

Java 8 has inbuilt Functional interfaces that can take only 1 or 2 arguments no more.*/
public class ConsumerDemo {
    public static void main(String[] args) {
        Consumer<Integer> squr = i -> System.out.println(i * i);
        squr.accept(5);
        Consumer<Integer> cube = i -> System.out.println(i * i * i);
        cube.accept(5);
        squr.andThen(cube).accept(2);//call two different method

        //in Supplier no chaining is possible it's not take any input it's only give output
        Supplier<Date>currDate= ()-> new Date();
        System.out.println(currDate.get());


    }
}
