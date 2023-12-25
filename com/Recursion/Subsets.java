package com.Recursion;

import java.util.ArrayList;

public class Subsets {
    public static void main(String[] args) {
        int[] nums = {1,2,3};
        int start = 0;
        ArrayList<Integer> res = new ArrayList<>();
        m1(start, nums, res);
    }

    public static void m1(int start, int[] nums, ArrayList<Integer> res) {
        // base condition
        if(start == nums.length) {
            System.out.println(res);
            return;
        }

        // adding an element present in nums
        res.add(nums[start]);
        m1(start+1, nums, res);

        // not adding the same element present in nums
        res.remove(res.size() - 1);
        m1(start+1, nums, res);
    }
}

// Output -
// [3, 1, 2]
// [3, 1]
// [3, 2]
// [3]
// [1, 2]
// [1]
// [2]
// []