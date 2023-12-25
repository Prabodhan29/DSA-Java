package com.Arrays;

public class NextGreaterElement3 {
    public static void main(String[] pro) {
        int n = 512;
        System.out.println(nextGreaterElement(n)); // 521
    }
    public static int nextGreaterElement(int n) {
        // convert n to nums array
        String temp = Integer.toString(n);
        int[] nums = new int[temp.length()];

        for(int i = 0; i < temp.length(); i++) {
            nums[i] = temp.charAt(i) - '0';
        }

        // find the next permutation
        nextPermutation(nums);

        // convert nums array to integer
        int res = 0;
        for(int i=0; i<nums.length; i++) {
            res = res * 10 + nums[i];
        }

        if(res > n) return res;
        return -1;
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
