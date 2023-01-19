package com.java.jdk11;

import org.junit.Test;

import java.util.stream.Collectors;

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
    @Test
    public void newMethodLines(){
        String str = "Geeks\nFor\nGeeks";
        System.out.println(
                str.lines().collect(Collectors.toList()));
    }
}
