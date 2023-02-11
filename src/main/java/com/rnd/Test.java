package com.rnd;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Test {
   // ExecutorService executor = Executors.newFixedThreadPool(10);


   // public static void main(String[] args) {

        private String s = "HELLO";
            public static void main(String args[])throws Exception {
            Test t = new Test();
                    t.doSomething();
                    Thread.sleep(2000);
                }
            public void doSomething(){
                    Object[] objArray =  new Object[2];
                   for(int i=0; i<objArray.length; i++){
                            objArray[i]  = new Object();
                        }
                }

    //}
/*
        Predicate<String> lengther = (s) -> s.length() < 2;
        Predicate<String> equalizer = Predicate.isEqual("car");
        Function<Boolean, String> booleaner = i -> Boolean.toString(i);
        Function<String, Boolean> stringer = s -> Boolean.parseBoolean(s);
        System.out.println(stringer.compose(booleaner).apply(true));
    }*/

    /*    Stream.of("little", "red", "riding", "hood")
                .parallel()
                .map(s -> {System.out.println("map: " + s + " " + Thread.currentThread().getName()); return s + "_";})
                .filter(s -> {System.out.println("filter: " + s + " " + Thread.currentThread().getName()); return s.length()>3;})
                .reduce( (s1, s2) -> {
                    System.out.println("reducer: " + s1 + " " + Thread.currentThread().getName());
                    return s1.length() > s2.length()? s1:s2;
                });
    }*/


   /* public void meth(String[] arg) {
        System.out.println(arg);
        System.out.println(arg[1]);
    }
            public static void main(String[] args) {
        Double d=null;
        int c=0;
                System.out.println(d instanceof Double);
                System.out.println(0==c++);

                List<String> list = new ArrayList<String>();
                list.add("1");
                list.add("2");
                list.add(0,"3");
                list.add(1,"4");
                list.forEach(System.out::println);*/

               /* List<String> letters = new ArrayList(Arrays.asList("D","B","A","C","F","G"));
                Predicate<String> p1 = s -> s.compareTo("C") > 0;
                Predicate<String> p2 = s -> s.equals("B");
                letters.removeIf(p1.negate().or(p2));
                letters.sort((s1,s2) -> s1.compareTo(s2));
                System.out.println(letters);*/
/*
                String stringA = "A";
                String stringB = "B";
                String stringnull = null;
                StringBuilder bufferc = new StringBuilder("C");
                Formatter fmt = new Formatter(bufferc);

                fmt.format("%s%s", stringA, stringB);
                System.out.println("Line 1: "+ fmt);

                fmt.format("%-2s", stringB);
                System.out.println("Line 2: "+ fmt);

                fmt.format("%b", stringnull);
                System.out.println("Line 3: "+ fmt);*/
   /*public static void main (String [] args) {
       LocalDate localDate = LocalDate.of(2015,4,4);
                  System.out.println(localDate.format(DateTimeFormatter.ofPattern("MMM dd, yyyy")));
                  System.out.println(localDate.format(DateTimeFormatter.ofPattern("E, MMM dd, yyyy")));
                  System.out.println(localDate.format(DateTimeFormatter.ofPattern("MM/dd/yy")));
*/


       /*Set<String> set = new LinkedHashSet<String>();
       set.add("3");
       set.add("1");
       set.add("3");
       set.add("2");
       set.add("3");
       set.add("1");
       set.forEach(s -> System.out.print(s+"-"));*/




       /*Supplier<String> i = () -> "Car";
       Consumer<String> c = x -> System.out.print(x.toLowerCase());
       Consumer<String> d = x -> System.out.print(x.toUpperCase());
       c.andThen(d).accept(i.get());
       System.out.println();*/

       /*int a = 9, b = 2;
       float f;
       f = a / b;
       System.out.println("f = " + f);
       f = f / 2;
       System.out.println("f = " + f);
       f = a + b / f;
       System.out.println("f = " + f);
       System.out.println(Stream.of("green", "yellow", "blue")
               .max((s1,s2) -> s1.compareTo(s2))
               .filter(s -> s.endsWith("n"))
               .orElse("yellow"));*/
   }


