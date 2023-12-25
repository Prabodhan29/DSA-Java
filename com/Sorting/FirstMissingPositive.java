package com.Sorting;

public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums = {0, 2, 1, 45, 333, 223, 643, 765433};
        System.out.println(firstMissingPositive(nums)); // 3
    }

    public static int firstMissingPositive(int[] nums) {
        // sorting
        int i = 0;
        while(i < nums.length) {
            // assuming that the elements are in the range 1 to n
            int correct = nums[i] - 1;

            // if we have assumed that numbers are in the range 1 to n
            // then nums[i] should be more than 0
            // also less than or equal to size of the array
            if(nums[i] > 0 && nums[i] <= nums.length && nums[i] != nums[correct]) {
                swap(nums, i, correct);
            }
            else {
                i++;
            }
        }

        for(int index=0; index<nums.length; index++) {
            if(nums[index] != index + 1) {
                return index + 1;
            }
        }

        // for cases like - [1], [1, 2] where the
        // missing positive number is one more than length of array
        return nums.length + 1;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
