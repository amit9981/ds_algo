package com.java.thread;

import lombok.SneakyThrows;

import java.util.concurrent.Semaphore;

public class ThreadPrinter implements Runnable{
  //  class ThreadPrinter  {
        int counter;
        Semaphore ins, outs;

        ThreadPrinter(int counter, Semaphore ins, Semaphore outs) {
            this.counter = counter;
            this.ins = ins;
            this.outs = outs;
        }

    public static void main(String[] args) {
        Semaphore a = new Semaphore(1);  // first thread is allowed to run immediately
        Semaphore b = new Semaphore(0); // second thread has to wait
        ThreadPrinter tp1 = new ThreadPrinter(1, a, b);
        ThreadPrinter tp2 = new ThreadPrinter(2, b, a);
        Thread t1=new Thread(tp1);
        Thread t2=new Thread(tp2);
        t1.start();t2.start();

    }

        @SneakyThrows
        @Override
        public void run() {
            for (int i = 0; i < 25; i++) {
                ins.acquire(); // wait for permission to run
                System.out.println("" + counter+ " "+Thread.currentThread().getName());
                outs.release();  // allow another thread to run
                counter += 2;
            }
        }
    }
