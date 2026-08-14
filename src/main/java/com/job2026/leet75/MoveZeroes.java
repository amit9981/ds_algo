package com.job2026.leet75;

import java.util.Arrays;

public class MoveZeroes {
    public static void main(String[] args) {
        movingBySingle();

    }
    public static void movingBySingle(){
        int[] nums = {1,2,2,3,3,3,4,5,5};

        int write = 0;
        int count = 1;

        nums[write++] = nums[0];

        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                count = 1;
            }

            // Keep first occurrence.
            // Keep second occurrence only if total count reaches 3 or more.
            if (count == 1 || count == 3) {
                nums[write++] = nums[i];
            }
        }

       // Arrays.fill(nums, write, nums.length, 0);

        System.out.println(Arrays.toString(nums));
    }

    public static void movingByWhile(){
        int[] nums={1,2,2,3,3,3,4,5,5};
        // out put : {1,2,3,3,4,5,0,0,0};
        int i=0;
        int write=0;
        while (i<nums.length){
            int count=0;
            int current=nums[i];
            while (i<nums.length && current==nums[i]){
                i++;
                count++;
            }
            // i++;
            if(count>=3){
                nums[write++]=current;
                nums[write++]=current;
            }else
            {
                nums[write++]=current;
            }
        }
        while (write < nums.length) {
            nums[write++] = 0;
        }
        System.out.println(Arrays.toString(nums));
    }
    /*public static void main(String[] args) {
       int[] nums = {0,1,0,3,12};
       int j = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;

                j++;
            }
        System.out.println(Arrays.toString(nums));
    }
        System.out.println("j: "+j);
}*/
}
