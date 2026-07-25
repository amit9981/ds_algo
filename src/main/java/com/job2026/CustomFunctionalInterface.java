package com.job2026;

import java.util.function.Predicate;

@FunctionalInterface
interface MathOperation {
    int operate(int a, int b); // The single abstract method
}
public class CustomFunctionalInterface {
        public static void main(String[] args) {
            // Implementing the interface cleanly using a Lambda Expression
            MathOperation addition = (a, b) -> a + b;
            MathOperation multiplication = (a, b) -> a * b;
            MathTest add=(a,b)->a+b;
            System.out.println("my interface :: "+add.taskOperation("Hello","Hi"));
            System.out.println("Sum: " + addition.operate(5, 3));        // Outputs 8
            System.out.println("Product: " + multiplication.operate(5, 3)); // Outputs 15
        }
    }

@FunctionalInterface
    interface MathTest{
    String taskOperation(String a,String b);
    }
