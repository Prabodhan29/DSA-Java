package com.Arrays;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
       // int[] nums = {1, 3, 5, 4, 2};
        int[] nums = {5,4,8,9,3,5,5,1,4,2};
        nextPermutation(nums);
        System.out.println(Arrays.toString(nums)); // [1, 4, 2, 3, 5]
    }
    public static void nextPermutation(int[] nums) {
        int index1 = -1;
        int index2 = -1;

        // Step 1
        for(int i=nums.length-2; i>=0; i--) {
            if(nums[i] < nums[i+1]) {
                index1 = i;
                break;
            }
        }

        // index1 does not exists.
        if(index1 == -1) {
            reverseArray(nums, 0, nums.length-1);
            return;
        }

        // Step 2
        for(int i=nums.length-1; i>=0; i--) {
            if(nums[i] > nums[index1]) {
                index2 = i;
                break;
            }
        }

        // Step 3
        swap(nums, index1, index2);

        // Step 4
        reverseArray(nums, index1+1, nums.length-1);
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void reverseArray(int[] nums, int start, int end) {
        while(start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}
