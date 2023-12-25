package com.BinarySearch;


public class FirstAndLastElementInArray {
    public static void main(String[] args) {
        int[] nums = {5, 6, 7, 8, 8, 8, 8, 45, 67};
        int target = 8;
        searchRange(nums, target); // [3, 6]
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] res = {-1, -1};

        int start_index = binarySearch(nums, target, true);
        int end_index = binarySearch(nums, target, false);

        res[0] = start_index;
        res[1] = end_index;

        return res;
    }

    public static int binarySearch(int[] nums, int target, boolean isStartIndex) {
        int start = 0;
        int end = nums.length-1;
        int answer = -1;

        while(start <= end) {
            int mid = start + (end-start)/2;
            if(nums[mid] < target) {
                start = mid + 1;
            }
            else if(nums[mid] > target) {
                end = mid - 1;
            }

            // target element found
            else {
                // mid is going to be stored somewhere
                // as we want to return the mid element
                answer = mid;

                // if we need to find the start index
                // the search space is going to be at left side
                if(isStartIndex) {
                    end = mid - 1;
                }

                // for end index
                // the search space is going to be at right side
                else {
                    start = mid + 1;
                }
            }
        }
        return answer;
    }
}
