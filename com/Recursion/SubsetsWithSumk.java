package com.Recursion;

import java.util.ArrayList;

public class SubsetsWithSumk {
    public static void main(String[] args) {
        int[] nums = {1, 5, 3, 2};
        int target = 6;
        int start = 0;
        ArrayList<Integer> res = new ArrayList<>();
        m1(nums, start, target, res);
    }

    private static void m1(int[] nums, int start, int target, ArrayList<Integer> res) {
        // base condition
        if(start == nums.length) {
            if(target == 0) {
                System.out.println(res);
            }
            return;
        }

        // pick an element
        res.add(nums[start]);
        m1(nums, start+1, target-nums[start], res);

        // don't pick an element
        res.remove(res.size() - 1);
        m1(nums, start+1, target, res);
    }
}

// Output -
// [1, 5]
// [1, 3, 2]