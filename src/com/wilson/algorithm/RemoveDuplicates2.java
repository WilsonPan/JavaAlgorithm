package com.wilson.algorithm;

import java.util.Arrays;

public class RemoveDuplicates2 {
    public static void main(String[] args) {
        int[] nums1 = new int[] { 0, 1, 1, 2, 2, 3 };
        int[] nums2 = new int[] { 0, 0, 1, 1, 1, 1, 2, 3, 3 };

        System.out.println(new RemoveDuplicates2().removeDuplicates(nums1));
        System.out.println(Arrays.toString(nums1));

        System.out.println(new RemoveDuplicates2().removeDuplicates(nums2));
        System.out.println(Arrays.toString(nums2));
    }

    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2)
            return nums.length;

        int maxVal = nums[0], left = 1, current = 1;
        while (current < nums.length) {
            if (nums[current] > maxVal) {
                nums[left++] = nums[current];
                maxVal = nums[left];
            }
            current++;
        }
        return left;
    }
}
