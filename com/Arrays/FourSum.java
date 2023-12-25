package com.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {
    public static void main(String[] args) {
        int[] nums = {1,0,-1,0,-2,2};
        int target = 0;
        System.out.println(fourSum(nums, target));
        // [[-2, -1, 1, 2], [-2, 0, 0, 2], [-1, 0, 0, 1]]
    }

    public static List<List<Integer>> fourSum(int[] nums, int target) {
        Arrays.sort(nums);

        List<List<Integer>> res = new ArrayList<>();

        for(int i=0; i<nums.length-3; i++) {
            if(i == 0 || (i > 0 && nums[i] != nums[i - 1])){

                for(int j=i+1; j<nums.length-2; j++) {
                    if(j==i+1 || (j>i+1 && nums[j]!=nums[j-1])){

                        int start = j + 1;
                        int end = nums.length - 1;

                        while (start < end) {
                            long sum = (long)nums[i] + (long)nums[j] + (long)nums[start] + (long)nums[end];

                            if(sum == target){
                                res.add(Arrays.asList(nums[i], nums[j], nums[start], nums[end]));

                                // check for duplicates
                                while(start < end && nums[start] == nums[start + 1]) start++;
                                while(start < end && nums[end] == nums[end - 1]) end--;

                                start++;
                                end--;
                            }
                            else if (sum < target) start++;
                            else end--;
                        }
                    }
                }
            }
        }
        return res;
    }
}
