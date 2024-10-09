package com.wilson.algorithm;

import java.util.Arrays;

/**
 * MergeSortedArray
 */
public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = new int[] { 4, 5, 6, 0, 0, 0 };
        int[] nums2 = new int[] { 1, 2, 3 };

        new MergeSortedArray().merge(nums1, 0, nums2, 0);
        
        System.out.println(Arrays.toString(nums1));
    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n <= 0) {
            return;
        }
        int p1 = m - 1, p2 = n - 1;
        int cur = m + n - 1;

        while (p1 >= 0 || p2 >= 0) {
            if (p1 < 0) {
                nums1[cur--] = nums2[p2--];
            } else if (p2 < 0) {
                nums1[cur--] = nums1[p1--];
            } else if (nums1[p1] > nums2[p2]) {
                nums1[cur--] = nums1[p1--];
            } else {
                nums1[cur--] = nums2[p2--];
            }
        }
    }
}
