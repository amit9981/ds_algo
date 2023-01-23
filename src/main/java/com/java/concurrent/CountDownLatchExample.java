package com.java.concurrent;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {
    public static void main(String[] args) {
        CountDownLatch countDownLatch = new CountDownLatch(2);
        new Thread(() -> {
            try {
                Thread.sleep(2000);
                System.out.println("Calling countdown by : " + Thread.currentThread().getName());
                countDownLatch.countDown();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }).start();
        new Thread(() -> {
            try {
                Thread.sleep(2000);
                System.out.println("Calling countdown by : " + Thread.currentThread().getName());
                countDownLatch.countDown();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }).start();

        try {
            System.out.println("Waiting for all other threads finish operation");
            countDownLatch.await();
            System.out.println("All other threads finish operation!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
