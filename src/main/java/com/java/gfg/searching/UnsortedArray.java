package com.java.gfg.searching;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class UnsortedArray {

    int arr[] = {12, 34, 10, 6, 40};
    int n = arr.length;

    public int[] testArray() {
        int[] arr = new int[20];
        arr[0] = 12;
        arr[1] = 16;
        arr[2] = 20;
        arr[3] = 40;
        arr[4] = 50;
        arr[5] = 70;
        return arr;
    }

    @Test
    public void linearSearch() {
        int key = 40;
        int found = -1; //-1 if not found
        for (int i = 0; i < n; i++) {
            if (arr[i] == key)
                found = i;  //it will return position of the key found
        }
        // If the key is not found the fail
        Assert.assertNotEquals(-1, found);
    }

    @Test
    public void insertAtTheEnd() {
        int[] array = testArray();
        int capacity = 20;
        int key = 26;
        int len = array.length;
        if (len <= capacity) {
            array[n] = key;
        }
        Arrays.stream(array).forEach(System.out::println);
    }
    @Test
    public void insertAtThePos() {
        int pos=2 ,val=11;
        int[] array = testArray();
        for (int i = n - 1; i >= pos; i--) {
            array[i + 1] = array[i];
        }
        array[pos] = val;
    Arrays.stream(array).forEach(System.out::println);
    }

    @Test
    public void deleteFromThePosition() {
        int val=12;
        int pos=findPosition(val);

        int[] array = testArray();
        for (int i = pos; i < n; i++) {
            array[i] = array[i+1];
        }
        Arrays.stream(array).forEach(System.out::println);
    }
    private int findPosition(int val){
        int pos=-1;
        int[] array = testArray();
        for (int i = 0; i < array.length; i++) {
            if(array[i]==val){
                pos=i;
            }
        }
        return pos;
    }
}
