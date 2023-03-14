package com.ds.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class PalidromNumber {
    public static void main(String[] args) {
        System.out.println(twoSum(new int[]{2, 7, 4},6));

       /* int num = 121;//211
        int temp=num;
        int reminder = 0;
        int sum = 0;

        while (num > 0) {
            reminder = num % 10;
            sum = (sum * 10 )+ reminder;
            num = num/10;
        }
       // int newNum = sum / 10;
        if (temp == sum) {
            System.out.println("Palidrom");
        } else {
            System.out.println("Not Palidrom");

        }*/
    }
    public static int[] twoSum(int[] nums, int target) {
        int a[]=new int[2];
        HashMap hashMap=new HashMap();

        for(int i =0;i<nums.length;i++){
            if(hashMap.containsKey(target-nums[i]) ){
                System.out.println(hashMap.get(target-nums[i])+" : "+i);
                a[0]= (int)hashMap.get(target-nums[i]);
                a[1]=i;
            }else {
                hashMap.put(nums[i],i);

            }
            //System.out.println(hashMap);
        }
        System.out.println(hashMap);

        /*
        HashSet hm=new HashSet();
        for(int i =0;i<nums.length-1;i++){
            if(hm.contains(target-nums[i]) ){
                //hm.put(nums[i],nums[i]);
                 a[0]=(target-nums[i]);
                    a[1]=nums[i];
                }

        }
        return a;
*/
        return a;
    }
}
