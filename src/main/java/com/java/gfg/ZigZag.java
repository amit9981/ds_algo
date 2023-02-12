package com.java.gfg;

import java.util.Arrays;


/*Given an array arr of distinct elements of size N, the task is to rearrange the elements of the array in a zig-zag
fashion so that the converted array should be in the below form:
arr[0] < arr[1]  > arr[2] < arr[3] > arr[4] < . . . . arr[n-2] < arr[n-1] > arr[n].
*/
public class ZigZag {
    public static void main(String[] args) {
        int arr[]={4,7,3,1,2,8,12};
        new ZigZag().zigZag(arr,7);
    }
    public void zigZag(int a[], int n){
        // Code your solution here.

        for(int i=0;i<n-1;i++){
            if(i%2==0){
                if(a[i]>a[i+1]){
                    swap(a,i,i+1);
                }
            }
            else{
                if(a[i]<a[i+1]){
                    swap(a,i,i+1);
                }
            }
        }
        Arrays.stream(a).forEach(s-> System.out.print(s+", "));
    }

    public void swap(int a[],int i,int j){

        int c=a[i];
        a[i]=a[j];
        a[j]=c;
    }
}
