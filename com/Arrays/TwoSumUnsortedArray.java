package com.Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumUnsortedArray {
    public static void main(String[] args) {
        int[] nums = {3, 2, 4, 5, 7};
        int target = 6;
        System.out.println(Arrays.toString(twoSumUsingHashMap(nums, target))); // [2, 1]
    }

    public static int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        int[] res = new int[2];

        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if(nums[i] + nums[j] == target) {
                    res[0] = nums[i];
                    res[1] = nums[j];
                }
            }
        }
        return res;
    }

    public static int[] twoSumUsingHashMap(int[] nums, int target) {
        int[] res = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++) {
            if(map.containsKey(target - nums[i])) {
                res[0] = i;
                res[1] = map.get(target - nums[i]);
                break;
            }
            map.put(nums[i], i);
        }

        return res;
    }
}
