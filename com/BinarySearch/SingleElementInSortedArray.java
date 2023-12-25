package com.BinarySearch;

import java.util.HashSet;

public class SingleElementInSortedArray {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 3, 3, 4, 4, 8, 8};
        System.out.println(singleNonDuplicate(nums)); // 2
        System.out.println(singleNonDuplicate2(nums)); // 2
    }

    public static int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        // see Image 1
        while(start < end) {
            int mid = start + (end - start)/2;
            if((mid % 2 == 0 && nums[mid] == nums[mid+1]) ||
                    (mid % 2 != 0 && nums[mid] == nums[mid-1])) {
                start = mid + 1;
            }
            else {
                end = mid;
            }
        }
        return nums[start]; // return nums[end];
    }

    public static int singleNonDuplicate2(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0; i<nums.length; i++) {
            // if element exists, then remove it
            if(hs.contains(nums[i])) {
                hs.remove(nums[i]);
            }
            // add elements in hs
            else {
                hs.add(nums[i]);
            }
        }

        // at the end, only single element would be left because the duplicate
        // elements would be removed. Return that single element.
        for(Integer i : hs) {
            return i;
        }
        // dummy return statement
        return -1;
    }
}
