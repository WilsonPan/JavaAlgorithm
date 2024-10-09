package com.wilson.algorithm;

import java.util.Arrays;

public class RemoveElement {
    public static void main(String[] args) {
        int[] nums1 = new int[] { 3, 2, 2, 3 };

        System.out.println(new RemoveElement().removeElement(nums1, 3));
        System.out.println(Arrays.toString(nums1));
    }

    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length <= 0)
            return 0;

        int pos = nums.length - 1;
        int current = nums.length - 1;

        while (current >= 0) {
            if (nums[current] == val) {
                nums[current] = nums[pos--];
            }
            current--;
        }
        return pos + 1;
    }
}
