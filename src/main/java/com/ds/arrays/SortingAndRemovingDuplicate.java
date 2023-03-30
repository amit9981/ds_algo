package com.ds.arrays;


public class SortingAndRemovingDuplicate {

    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 3, 6, 9, 2, 5};
        int[] sortedArr = sortedArray(arr);
        int[] sortedWithUniqueVal = removingDuplicate(sortedArr);
        printArray(sortedWithUniqueVal);
    }

    private static int[] sortedArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    private static int[] removingDuplicate(int[] sortedArr) {
        int[] dArr = new int[sortedArr.length];
        int z = 0;
        boolean flag = false;
        for (int i = 0; i < sortedArr.length; i++) {
            for (int j = i + 1; j < sortedArr.length; j++) {
                flag = false;
                if (sortedArr[j] - sortedArr[i] == 0) {
                    flag = true;
                    break;
                }
            }
            if (flag) {
                i++;
            }
            dArr[z] = sortedArr[i];
            z++;
        }
        return dArr;
    }

    private static void printArray(int[] dArr) {
        System.out.print("[");
        for (int i = 0; i < dArr.length; i++) {
            System.out.print(dArr[i] + ",");
        }
        System.out.print("]");
    }
}
