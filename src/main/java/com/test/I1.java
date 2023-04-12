package com.test;
@FunctionalInterface
public interface I1 {
    void test();
      default void m1(){
          System.out.println("I1");
      }

    public static void main(String[] args) {

    }

}

interface  I2 extends I1{
    void t1();
    default void m1(){
        System.out.println("I2");

    }
}
interface  I3{
    void m1();
}
class A implements I1{
    void call(){
        m1();
    }
   /* void callMe(){
    }
    String callMe(){
    }*/

    @Override
    public void test() {

    }

    @Override
    public void m1() {
        I1.super.m1();
    }
}