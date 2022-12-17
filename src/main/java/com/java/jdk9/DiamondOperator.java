package com.java.jdk9;

public class DiamondOperator {
    //We use the diamond operator to omit type on the constructor call new StringAppender<>(). Since we are using Java 8, in this example we will get a compiler error:

    StringAppender<String> appending = new StringAppender<>() {
        @Override
        public String append(String a, String b) {
            return new StringBuilder(a).append("-").append(b).toString();
        }
    };

    public abstract static class StringAppender<T> {
        public abstract T append(String a, String b);
    }
    /* Compiler Error
    java: cannot infer type arguments for
com.reflectoring.io.java9.DiamondOperator.StringAppender<T>

reason: '<>' with anonymous inner classes is not supported in -source 8
    (use -source 9 or higher to enable '<>' with anonymous inner classes)*/

    //after java 9 no error
}
