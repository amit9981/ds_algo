package com.ds.arrays;

import java.util.Arrays;
import java.util.stream.Stream;

public class SortedSqureArray {
    public static void main(String[] args) {
        int []array=new int[]{1,2,3,4,5};
        int newArray[]=new int[array.length];
        for (int i = 0; i < array.length; i++) {
            newArray[i]=array[i]*array[i];
        }
        System.out.println(Arrays.toString(newArray));
        Arrays.stream(newArray).forEach(s -> System.out.println(s+1));
//Stream
/*        for (int i = 0; i < newArray.length; i++) {

            System.out.println(newArray[i]);

        }*/
        }


}
