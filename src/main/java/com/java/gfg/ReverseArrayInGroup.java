package com.java.gfg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/*Given an array arr[] of positive integers of size N. Reverse every sub-array group of size K.

Note: If at any instance, there are no more subarrays of size greater than or equal to K,
then reverse the last subarray (irrespective of its size). You shouldn't return any array, modify the given array in-place.
* */
public class ReverseArrayInGroup {
    public static void main(String[] args) {
        ArrayList arr=new ArrayList();//.asList(1,2,3,4,5);
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        new ReverseArrayInGroup().reverseInGroups((ArrayList<Integer>) arr,5,3);


    }
    void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        // code here
        int size=arr.size();
        ArrayList<Integer> newArr=new ArrayList();
        for(int i=k-1;i>=0;i--){
            newArr.add(arr.get(i));
        }
        for(int i=size-1;i>=k;i--){
            newArr.add(arr.get(i));
        }
        System.out.println(newArr);
    }

}
