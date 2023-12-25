package com.Sorting;

public class FindDuplicateNumber {
    public static void main(String[] args) {
        int[] nums = {1,3,4,2,2};
        System.out.println(findDuplicate(nums)); // 2
    }

    public static int findDuplicate(int[] nums) {
        // sorting
        int i=0;
        while(i<nums.length) {
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]) {
                swap(nums, i, correct);
            }
            else {
                i++;
            }
        }

        // solution
        for(int index=0; index<nums.length; index++) {
            if(nums[index] != index+1) {
                return nums[index];
            }
        }
        return nums[nums.length-1];
    }
    public static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
