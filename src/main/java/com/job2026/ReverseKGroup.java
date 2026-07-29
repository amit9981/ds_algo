package com.job2026;

import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class ReverseKGroup {
    public static void reverse(int[] arr, int k) {
        for (int i = 0; i < arr.length; i += k) {

            int left = i;
            int right = Math.min(i + k - 1, arr.length - 1);

            while (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }
    }
    public static void reverseAdj(int arr[],int m){
        int temp;
        for (int i = 0; i < arr.length; i+=m) {
           temp=arr[i];
           arr[i]=arr[i+1];
           arr[i+1]=temp;
        }
        System.out.println(arr.toString());
    }

    public static void firstAndLast(int[] arr) {
        int k = arr.length;
        int j=k-1;
        for (int i = 1; i < k; i+=2) {

            int left = i;
            int right = j;
            while (left < right) {
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;

                left++;
                right--;
            }
        }
    }
    ///{1,8,2,7,3,6,4,5}

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

        //reverse(arr, 4);
        reverseAdj(arr,3);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
}
