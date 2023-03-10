package com.java.jdk8;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionChaining {
    public static void main(String[] args) {
        Predicate<String> strLen= s->s.length()>5;
        System.out.println(strLen.test("hello Amit"));
        Function<Integer,Integer> functionTest = i -> i*i;
        System.out.println("functionTest  "+functionTest.apply(5));
        Function<Integer,Integer> sqr=i-> (i*2);
        //System.out.println(sqr.apply(3);
        Function<Integer,Integer> cube=i-> (i*i*i);//two arg input,output
        System.out.println(sqr.andThen(cube).apply(2));
        System.out.println(sqr.compose(cube).apply(2));  //this is only in Function not in predicate and not in consumer

////
        BiPredicate<Integer,Integer> addResult= (a, b)-> a+b >=5;
        System.out.println(addResult.test(1 ,2));

        BiFunction<Integer,Integer,Integer> multi = (a,b) -> a*b;
        System.out.println("multi  "+multi.apply(5,2));
       Function<Integer,Integer> sqr1 =i-> (i*2);
        //System.out.println(sqr.apply(3);
        Function<Integer,Integer> cube1=i-> (i*i*i);//two arg input,output
        System.out.println(sqr1.andThen(cube1).apply(2));
        System.out.println(sqr1.compose(cube1).apply(2));
    }
}
