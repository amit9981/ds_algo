package com.test;

import com.google.gson.stream.JsonToken;

public class TestDemo {
    /*Given a limit, find the sum of all the even-valued terms in the Fibonacci sequence below given limit.
    The first few terms of Fibonacci Numbers are, 1, 1, 2, 3, 5, 8, 13, 21, 34....

    */
    public static void main(String[] args) {

        int a=1, b=1, sum=0;
        int total =0;
        System.out.println(a);
        for (int i = 0; i <100; i++) {
            sum=a+b;
            a=b;
            b=sum;
           if(sum%2==0){
               total+=sum;
           }
            if(sum>100){
                break;
            }
            System.out.println(sum);

        }
        System.out.println(total);
    }

}













