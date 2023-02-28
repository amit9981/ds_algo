package com.rnd;

public class CreateThreadWithJava8 {
    public static void main(String[] args) {


        Runnable myRun1 = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + "is running..1");
        };
        Runnable myRun2 = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + "is running..2");
        };
        Runnable myRun3 = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + "is running..3");
        };
        Thread t1 = new Thread(myRun1);
        Thread t2 = new Thread(myRun1);
        Thread t3 = new Thread(myRun1);

        t1.start();
        t2.start();
        t3.start();

    }
}
