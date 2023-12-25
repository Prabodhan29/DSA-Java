package com.Arrays;

public class IsArraySortedAndRotated {
    public static void main(String[] args) {
        int[] nums = {3,4,5,1,2};
        System.out.println(check(nums)); // true
    }

    public static boolean check(int[] nums) {
        int count = 0;

        for(int i=0; i<nums.length-1; i++) {
            if(nums[i] > nums[i+1]) {
                count++;
            }
        }

        // already sorted
        if(count == 0) {
            return true;
        }

        // because there can be only one pivot point
        // and the first element is always greater than the last elemenet
        // in a sorted and rotated array.
        // If the array is rotated, then count will only be 1.
        if(count == 1 && nums[0] >= nums[nums.length-1]) {
            return true;
        }

        // array is neither sorted nor rotated.
        return false;
    }
}
