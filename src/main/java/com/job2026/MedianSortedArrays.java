package com.job2026;

public class MedianSortedArrays {

        public static double findMedian(int[] nums1, int[] nums2) {

            int[] merged = new int[nums1.length + nums2.length];

            int i = 0, j = 0, k = 0;

            while (i < nums1.length && j < nums2.length) {
                if (nums1[i] < nums2[j])
                    merged[k++] = nums1[i++];
                else
                    merged[k++] = nums2[j++];
            }

            while (i < nums1.length)
                merged[k++] = nums1[i++];

            while (j < nums2.length)
                merged[k++] = nums2[j++];

            int n = merged.length;

            if (n % 2 == 0)
                return (merged[n / 2] + merged[n / 2 - 1]) / 2.0;

            return merged[n / 2];
        }

        public static void main(String[] args) {
            int[] nums1 = {1, 2};
            int[] nums2 = {3, 4,5};
            System.out.println(findMedian(nums1, nums2));
        }
}
