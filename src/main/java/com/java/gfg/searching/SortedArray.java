package com.java.gfg.searching;

import org.junit.Assert;
import org.junit.Test;

public class SortedArray {

    static int binarySearch(int arr[], int low, int high,
                            int key) {
        if (high < low)
            return -1;
        /*low + (high - low)/2;*/
        int mid = (low + high) / 2;
        if (key == arr[mid])
            return mid;
        if (key > arr[mid])
            return binarySearch(arr, (mid + 1), high, key);
        return binarySearch(arr, low, (mid - 1), key);
    }

    /* Driver Code*/
    public static void main(String[] args) {
        int arr[] = {5, 6, 7, 8, 9, 10};
        int n, key;
        n = arr.length - 1;
        key = 11;

        // Function call
       /* System.out.println("Index: "
                + binarySearch(arr, 0, n, key));*/


        System.out.println("Index: "
                + binarysearch1(arr, n, key));

    }

    public static int binarysearch1(int arr[], int n, int k) {
        int start = 0;
        int end = arr.length - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == k) {
                return mid;
            } else if (arr[mid] < k) {
                start = mid + 1;
            } else if (arr[mid] > k) {
                end = mid - 1;
            }
        }
        return -1;
    }


    /*@Test
    public void binarySearchTest() {
        int arr[] = {5, 6, 7, 8, 9, 10};
        int n, key,low=0,high;
        n = arr.length - 1;
        high=n;
        key = 10;
        int mid = (low + high) / 2;
        boolean found = false;
        if (low > high)
            found = false;
        else if (arr[mid] == key) {
            found = true;
        } else if (key > arr[mid]) {
            binarySearch(arr, (mid + 1), high, key);
        }
       // binarySearchTest(arr, low, (mid - 1), key);
        Assert.assertEquals(true,found);
    }*/
}
