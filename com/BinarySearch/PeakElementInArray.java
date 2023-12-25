package com.BinarySearch;

public class PeakElementInArray {
    public static void main(String[] args) {
        int[] nums = {1, 2, 1, 3, 5, 6, 4};
        System.out.println(findPeakElement(nums)); // 5
        // We are finding the index of peak element
    }

    public static int findPeakElement(int[] nums) {
        if(nums.length == 1) return 0;

        // image 1
        if(nums[0] > nums[1]) return 0;

        // image 2
        if(nums[nums.length-1] > nums[nums.length-2]) {
            return nums.length-1;
        }

        // as we have already looked at first element
        // in image 1
        int start = 1;

        // as we have already looked at last element
        // in image 2
        int end = nums.length - 2;

        while(start <= end) {
            int mid = start + (end-start)/2;

            // if mid is the peak element
            // that is, mid is greater than previous element
            // and greater than the next element in the array
            if(nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1]) {
                return mid;
            }

            // if mid is at the left side of the peak element
            // this is not equivalent to strictly increasing side
            // in mountain array.
            else if (nums[mid] < nums[mid+1]) {
                start = mid + 1;
            }

            // if mid is at the right side of the peak element
            // this is not equivalent to strictly decreasing side
            // in mountain array.
            else if(nums[mid] < nums[mid-1]) {
                end = mid - 1;
            }
        }

        // dummy return statement
        // this return statement is never going to be executed.
        return -1;
    }
}
