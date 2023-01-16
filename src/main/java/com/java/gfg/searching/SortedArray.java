package com.java.gfg.searching;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

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
   /* public static void main(String[] args) {
        int arr[] = {5, 6, 7, 8, 9, 10};
        int n, key;
        n = arr.length - 1;
        key = 11;

        // Function call
       *//* System.out.println("Index: "
                + binarySearch(arr, 0, n, key));*//*


        System.out.println("Index: "
                + binarysearch1(arr, n, key));

    }*/

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
    @Test
    public void insertAtTheSortedArray() {
        int val=13;
        int[] array = testArray();
        int n=6;
        int capacity=array.length;
        for (int i = n - 1; (i >= 0 ); i--) {
            if(val>array[i]){
                array[i]=val;
                break;

            }
            array[i + 1] = array[i];
            //array[i + 1] = val;


        }
        Arrays.stream(array).forEach(System.out::println);
    }
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

    static int insertSorted(int arr[], int n, int key,
                            int capacity)
    {
        // Cannot insert more elements if n is already
        // more than or equal to capacity
        if (n >= capacity)
            return n;

        int i;
        for (i = n - 1; (i >= 0 && arr[i] > key); i--)
            arr[i + 1] = arr[i];

        arr[i + 1] = key;

        return (n + 1);
    }

    /* Driver code */
    public static void main(String[] args)
    {
        int arr[] = new int[20];
        arr[0] = 12;
        arr[1] = 16;
        arr[2] = 20;
        arr[3] = 40;
        arr[4] = 50;
        arr[5] = 70;
        int capacity = arr.length;
        int n = 6;
        int key = 26;

        System.out.print("\nBefore Insertion: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");

        // Function call
        n = insertSorted(arr, n, key, capacity);

        System.out.print("\nAfter Insertion: ");
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
}
