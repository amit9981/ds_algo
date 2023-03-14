package com.java.gfg;

import java.util.Arrays;
import java.util.stream.Collectors;

public class TestArray {
    public static int[] getArrays(){
      int  arr[] = {1,2,3,4,5};
        Arrays.stream(arr).boxed().collect(Collectors.toList());
        return arr;
    }

}
