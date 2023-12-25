package com.BinarySearch;

public class MinimumInRotatedSortedArray {
    public static void main(String[] args) {
        int[] nums = {3, 4, 5, 1, 2};
        System.out.println(findMin(nums)); // 1
    }

    public static int findMin(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            // because the answer is going to be one element after pivot.
            if(mid > 0 && nums[mid] < nums[mid-1]) {
                return nums[mid];
            }

            // we are at the left side of pivot -> the ans does not lie here.
            // So, move the search space to the right side.
            else if(nums[mid] >= nums[start] && nums[mid] > nums[end]) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }

        // because in the if condition we were doing mid > 0 to avoid
        // IndexOutOfBoundsError. So if we couldn't find the answer using
        // binary search, then the answer will be the first element of the array ->
        // that is, the array was not rotated (just sorted).
        return nums[0];
    }
}
