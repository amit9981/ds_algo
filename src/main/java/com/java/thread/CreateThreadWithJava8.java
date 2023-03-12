package com.java.thread;

public class CreateThreadWithJava8 {
    public static void main(String[] args) {
        Runnable myrun = () -> {
            String tName = Thread.currentThread().getName();
            System.out.println(tName + " my Thread");
        };

        Runnable myRun1 = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " is running..1");
        };
        Runnable myRun2 = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " is running..2");
        };
        Runnable myRun3 = () -> {
            String threadName = Thread.currentThread().getName();
            System.out.println(threadName + " is running..3");
        };
        Thread t1 = new Thread(myRun1);
        Thread t2 = new Thread(myRun1);
        Thread t3 = new Thread(myRun1);
        Thread t4 = new Thread(myrun);
      /*  for (int i = ; i <=10; i++) {
            t1.start();
            System.out.println(i+ " from thread " +Thread.currentThread().getName());
        }*/
        for (int i = 1; i <=10; i++) {
            t2.start();
            System.out.println(i+ " from thread " +Thread.currentThread().getName());
        }for (int i = 11; i <=20; i++) {
            t3.start();
            System.out.println(i+ " from thread " +Thread.currentThread().getName());
        }for (int i = 21; i <=30; i++) {
            t4.start();
            System.out.println(i+ " from thread " +Thread.currentThread().getName());
        }

       /* t1.start();
        t2.start();
        t3.start();
        t4.start();*/


    }
}
