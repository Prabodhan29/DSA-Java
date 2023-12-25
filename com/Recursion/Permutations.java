package com.Recursion;

import java.util.ArrayList;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3};
        System.out.println(permute(nums));
        // [[1, 2, 3], [1, 3, 2], [2, 1, 3], [2, 3, 1], [3, 1, 2], [3, 2, 1]]
    }

    public static List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[] map = new boolean[nums.length];

        m1(nums, res, new ArrayList<>(), map);

        return res;
    }

    public static void m1(int[] nums, List<List<Integer>> res, ArrayList<Integer> tempAL, boolean[] map) {

        // base condition
        if(tempAL.size() == nums.length) {
            res.add(new ArrayList<>(tempAL));
            return;
        }

        for(int i = 0; i<nums.length; i++) {
            // if the map array does not have the ith element, then only run this
            // We can do this because map is a boolean array which contains true/false values.
            if(!map[i]) {
                tempAL.add(nums[i]);
                map[i] = true; // as the element is being picked.
                m1(nums, res, tempAL, map);

                tempAL.remove(tempAL.size()-1);
                map[i] = false; // the element has been removed.
            }
        }
    }
}
