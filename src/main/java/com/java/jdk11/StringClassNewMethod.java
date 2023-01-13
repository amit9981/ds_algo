package com.java.jdk11;

import org.junit.Test;

public class StringClassNewMethod {

    @Test
    public void newMethod(){
        String str1 = "";
        str1.isBlank();
        String str2 = "GeeksForGeeks";
        System.out.println(str2.isBlank());
    }
    @Test
    public void newMethodIsBlank(){
        String str1 = "";
        str1.isBlank();
        String str2 = "GeeksForGeeks";
        System.out.println(str1.isBlank());
    }
}
