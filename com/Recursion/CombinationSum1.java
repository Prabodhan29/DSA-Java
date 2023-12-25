package com.Recursion;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum1 {
    public static void main(String[] args) {
        int[] candidates = {2, 3, 6, 7};
        int target = 7;
        System.out.println(combinationSum(candidates, target)); // [[2, 2, 3], [7]]
    }
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        int start = 0;
        List<List<Integer>> res = new ArrayList<>();
        m1(candidates, start, target, new ArrayList<>(), res);

        return res;
    }

    public static void m1(int[] nums, int start, int target, ArrayList<Integer> tempAL, List<List<Integer>> res) {
        // base condition
        if(start == nums.length) {
            // as we are reducing the target (as 2 + 5 = 7), but
            // 2 is also equal to 7 - 5. (2, 5 are elements in the array and 7 is target)
            if(target == 0) {
                res.add(new ArrayList<>(tempAL));
            }
            return;
        }

        // ------ PICK ELEMENT -------
        // pick/add the element. The element we are adding should be less than or
        // equal to target. If it's more, then summation would be greater than target.
        if(nums[start] <= target) {
            tempAL.add(nums[start]);

            // we are not incrementing start because we are picking the same element.
            // we are doing target-nums[start] as we want to reduce the target for each
            // recursive call (see base condition)
            m1(nums, start, target-nums[start], tempAL, res);

            // remove the element before going to the next recursive function,
            // or right side of recursive tree.
            tempAL.remove(tempAL.size()-1);
        }

        // ------ DON'T PICK ELEMENT -------
        // if we are not picking the same element again, then only increment start,
        // otherwise don't (as we were doing in the above recursive call).
        // We are also know subtracting the element from target as we are not picking
        // that element.
        m1(nums, start+1, target, tempAL, res);
    }
}
