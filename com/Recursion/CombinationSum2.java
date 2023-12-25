package com.Recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CombinationSum2 {
    public static void main(String[] args) {
        int[] candidates = {2,5,2,1,2};
        int target = 5;
        System.out.println(combinationSum2(candidates, target)); // [[1, 2, 2], [5]]
    }

    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
        int start = 0;
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>();
        m1(candidates, start, target, new ArrayList<>(), res);

        return res;
    }
    public static void m1(int[] nums, int start, int target, ArrayList<Integer> tempAL, List<List<Integer>> res) {
        // base condition
        if(target == 0) {
            res.add(new ArrayList<>(tempAL));
            return;
        }

        for(int i=start; i<nums.length; i++) {
            // if an element is equal to the element before
            // don't take that element -> as it will give us duplicate subsets.
            if(i > start && nums[i] == nums[i-1]) continue;

            // because what's the point of adding a number greater than target
            // into tempAL. We used break and not continue because we want to break out
            // of the loop, so that the next method present in the stack can be executed.
            if(nums[i] > target) break;

            tempAL.add(nums[i]);

            // we cannot increment start by 1 as we are inside a for loop
            // so we need to increment i.
            m1(nums, i+1, target-nums[i], tempAL, res);

            tempAL.remove(tempAL.size()-1);
        }
    }
}
