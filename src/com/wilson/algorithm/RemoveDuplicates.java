package com.wilson.algorithm;

import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] nums1 = new int[] { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
        int[] nums2 = new int[] { 1, 2, 3 };

        System.out.println(new RemoveDuplicates().removeDuplicates(nums1));
        System.out.println(Arrays.toString(nums1));

        System.out.println(new RemoveDuplicates().removeDuplicates(nums2));
        System.out.println(Arrays.toString(nums2));
    }

    public int removeDuplicates(int[] nums) {
        int left = 1, current = 1;
        while (current < nums.length) {
            if (nums[current] > nums[left - 1]) {
                nums[left++] = nums[current];
            }
            current++;
        }
        return left;
    }
}
