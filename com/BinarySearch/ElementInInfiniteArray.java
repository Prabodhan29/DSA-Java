package com.BinarySearch;

public class ElementInInfiniteArray {
    public static void main(String[] args) {
        int[] nums = {5, 6, 7, 8, 45, 67};
        int target = 8;
        System.out.println(search(nums, target)); // 3
    }

    public static int search(int[] nums, int target) {
        // Infinite array means we don't know the end index

        int start = 0;
        int end = 1;

        while(start <= end) {
            int mid = start + (end-start)/2;
            if(nums[mid] == target) {
                return mid;
            }
            else if (nums[mid] < target) {
                int temp = end + 1;
                end = end + (end-start+1)*2;
                start = temp;
            }
        }
        return -1;
    }
}
