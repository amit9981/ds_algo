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
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        if (nums1.length > nums2.length)
            return findMedianSortedArrays(nums2, nums1);

        int x = nums1.length;
        int y = nums2.length;

        int low = 0;
        int high = x;

        while (low <= high) {

            int partitionX = (low + high) / 2;
            int partitionY = (x + y + 1) / 2 - partitionX;

            int maxLeftX = (partitionX == 0) ? Integer.MIN_VALUE : nums1[partitionX - 1];
            int minRightX = (partitionX == x) ? Integer.MAX_VALUE : nums1[partitionX];

            int maxLeftY = (partitionY == 0) ? Integer.MIN_VALUE : nums2[partitionY - 1];
            int minRightY = (partitionY == y) ? Integer.MAX_VALUE : nums2[partitionY];

            if (maxLeftX <= minRightY && maxLeftY <= minRightX) {

                if ((x + y) % 2 == 0) {
                    return (Math.max(maxLeftX, maxLeftY)
                            + Math.min(minRightX, minRightY)) / 2.0;
                }

                return Math.max(maxLeftX, maxLeftY);
            }

            if (maxLeftX > minRightY)
                high = partitionX - 1;
            else
                low = partitionX + 1;
        }

        throw new IllegalArgumentException("Input arrays are not sorted.");
    }

        public static void main(String[] args) {
            int[] nums1 = {1, 2};
            int[] nums2 = {3};
        //    System.out.println(findMedian(nums1, nums2));
            System.out.println(findMedianSortedArrays(nums1,nums2));
        }

}
