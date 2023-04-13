package com.java.dynamic;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(fib(5));
    }

    static int[] fibArr = new int[5 + 1];
  private static int fib(int n){
        if (n == 0 || n == 1) {
            return 1;
        }
        if (fibArr[n] != 0)
            return fibArr[n];
        return fibArr[n] = fib(n - 1) + fib(n - 2);
    }


}
