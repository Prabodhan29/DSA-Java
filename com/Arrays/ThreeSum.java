package com.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums)); // [[-1, -1, 2], [-1, 0, 1]]
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();

        // see image 1
        for(int i = 0; i < nums.length-2; i++) {
            if(i == 0 || (i > 0 && nums[i] != nums[i-1])) {
                int start = i + 1;
                int end = nums.length - 1;
                int sum = 0 - nums[i]; // a+b+c=0 => b+c = 0-a

                // similar to two sum for sorted array
                while(start < end) {
                    if(nums[start] + nums[end] == sum) {
                        res.add(Arrays.asList(nums[i], nums[start], nums[end]));

                        // because we don't want duplicates (see image 2)
                        while(start < end && nums[start] == nums[start+1]) {
                            start++;
                        }

                        // see image 2
                        while(start < end && nums[end] == nums[end-1]) {
                            end--;
                        }

                        // if both the while loop condition fails, then increment
                        // and decrement start and end simultaneously.
                        start++;
                        end--;

                    }
                    else if(nums[start] + nums[end] < sum) start++;
                    else end--;
                }
            }
        }

        return res;
    }
}
