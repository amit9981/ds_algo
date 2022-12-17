package com.java.jdk9;

public class PrivateInterface implements Sayable {
    public static void main(String[] args) {
        PrivateInterface s = new PrivateInterface();
        s.say();
    }
}

/*We can call private static method from default method and it won't give any compilation error after java9*/
interface Sayable {
    default void say() {
        saySomething(); // Calling private method
        sayPolitely(); //  Calling private static method
    }

    // Private method inside interface
    private void saySomething() {
        System.out.println("Hello... I'm private method");
    }

    // Private static method inside interface
    private static void sayPolitely() {
        System.out.println("I'm private static method");
    }
}
