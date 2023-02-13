package com.java.gfg;
/*
Given an array of N integers. Find the first element that occurs at least K number of times.
*/

import java.util.HashMap;

public class FirstElementKTimes {

    public static void main(String[] args) {
        int n = 7, k = 1;
       // int a[] = {1, 7, 4, 3, 4, 8, 7};
       // int a[] = {4,2,2,2,3,4,4,4,3,2};
        int a[] = {3,1,2};

        int count=1,find=-1;
        HashMap hashMap= new HashMap();
        for (int i = 0; i <a.length ; i++) {

            if(hashMap.containsKey(a[i])){
                hashMap.put(a[i],(Integer)hashMap.get(a[i])+1);
                if ((Integer) hashMap.get(a[i]) == k) {
                    find=a[i];
                    break;
                }
            }else
            {
                hashMap.put(a[i],1);
                if((Integer) hashMap.get(a[i]) == k){
                    find=a[i];
                    break;
                }
            }
        }
        System.out.println(find);
    }
}
