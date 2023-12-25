package com.Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {3, 2, 3};
        System.out.println(mooreVotingAlgorithm(nums)); // 3
        System.out.println(majorityElement1(nums)); // 3
        System.out.println(majorityElement2(nums)); // 3
    }

    public static int mooreVotingAlgorithm(int[] nums) {
        int count = 0;
        int current_num = 0;

        for(int i = 0; i < nums.length; i++) {
            // update the current_num
            if(count == 0) {
                current_num = nums[i];
            }

            // for first iteration - current_num = nums[0] and nums[i] = nums[1]
            // as we have an if statement above and not an if...else statement.
            if(current_num == nums[i]) count++;

                // if we found any element different from the current_num, then
                // decrement count.
            else count--;
        }
        return current_num;
    }

    public static int majorityElement1(int[] nums) {
        Arrays.sort(nums);
        // because after sorting the majority element is going to be at index
        // n/2 as a majority element is an element which occurs more than n/2.
        // Also, nums[nums.length/2] could be the starting point of the
        // majority element sequence, or it could be the ending, or it could also be
        // the middle. But the majority element will be at n/2.
        return nums[nums.length/2];
    }

    public static int majorityElement2(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;

        for(int i=0; i<nums.length; i++) {

            // if the map does not contain nums[i], the add that element.
            // but the value will be 1 -> later on we increase the value if
            // the element occurs again.
            if(!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            }

            // map contains nums[i] -> that is, increment the value of the
            // already existing element by 1.
            else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }

            // if we find the majority element, then return it immediately.
            if(map.get(nums[i]) > nums.length/2) {
                return nums[i];
            }
        }
        return -1;
    }
}
