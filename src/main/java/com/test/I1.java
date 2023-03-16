package com.test;

public interface I1 {
      default void m1(){
          System.out.println("I1");
      }

    public static void main(String[] args) {

    }

}
interface  I2{
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
    void callMe(){
    }
}