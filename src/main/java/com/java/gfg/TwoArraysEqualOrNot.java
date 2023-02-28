package com.java.gfg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

/*How to comapire 2 different Arrays and Collections Object*/
public class TwoArraysEqualOrNot {
    public static void main(String[] args) {
       int  a[] = {1,2,5,4,0};
       int  b[] = {2,4,5,0,1};
        ArrayList a1=new ArrayList();
        ArrayList b1=new ArrayList();
        a1.add(1);
        a1.add(2);
        a1.add(3);
        a1.add(4);
        a1.add(5);
        b1.add(3);
        b1.add(1);
        b1.add(2);
        b1.add(5);
        b1.add(4);
        Arrays.sort(a);
        Arrays.sort(b);
        System.out.println(Arrays.equals(a,b));
        Collections.sort(a1);
        Collections.sort(b1);
     //R collect = Arrays.stream(b).sorted().collect(Collectors.toList());

    }
}
