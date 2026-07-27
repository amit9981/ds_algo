package com.job2026;

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

        public static void main(String[] args) {

            int[] arr = {1,2,3,4,5,6,7,8};

            reverse(arr, 4);

            for (int num : arr) {
                System.out.print(num + " ");
            }
        }
}
