package com.java.thread;

public class CheckThreadHoldLock {

    CheckThreadHoldLock(){
        System.out.println("out side block "+Thread.holdsLock(this));
        synchronized (this){
            System.out.println("Inside Block "+Thread.holdsLock(this));
        }
    }

    public static void main(String[] args) {
        Thread t=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("main ");
                CheckThreadHoldLock check =new CheckThreadHoldLock();
            }
        });
        t.start();
    }
}
