package com.BinarySearch;

public class SearchInRotatedArray {
    public static void main(String[] args) {
        int[] nums = {4, 5, 6, 7, 0, 1, 2, 3};
        int target = 2;
        System.out.println(search(nums, target)); // 6
    }

    public static int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while(start <= end) {
            int mid = start + (end - start)/2;

            // target found
            if(nums[mid] == target) {
                return mid;
            }

            // to check whether target is present at left side
            // that is, start should be less than the mid
            // as we have a rotated sorted array
            if(nums[mid] >= nums[start]) {

                // to check whether target is present in that side
                // that is, target should be in the range [start, mid)
                // we are not including mid -> as mid is being returned
                if(target >= nums[start] && target < nums[mid]) {

                    // if we want to return mid here only
                    // then we again need to perform binary search
                    // which would increase the time complexity
                    // the better option is to simply reduce the search space
                    end = mid - 1;
                }
                else {
                    start = mid + 1;
                }
            }

            // to check whether target is present at right side
            // that is, mid should be less than the end
            // as we have a rotated sorted array
            if(nums[mid] <= nums[end]) {

                // then the target should be present in the range
                // (mid, end]
                if(target > nums[mid] && target <= nums[end]) {

                    // reduce the search space, rather than
                    // performing another binary search
                    start = mid + 1;
                }
                else {
                    end = mid - 1;
                }
            }
        }

        // if the target does not exist in the array.
        return -1;
    }
}
