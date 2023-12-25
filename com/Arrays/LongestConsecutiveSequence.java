package com.Arrays;

import java.util.Arrays;
import java.util.HashSet;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        int[] arr = {100, 4, 200, 1, 3, 2, 4, 4};
        System.out.println(longestConsecutive1(arr)); // 4
        System.out.println(longestConsecutive2(arr)); // 4
    }

    public static int longestConsecutive1(int[] nums) {
        if(nums.length==0) return 0;

        // because only a single element also consitutes as a sequence.
        // So the minimum answer is 1.
        int res = 1;
        int count = 1;

        Arrays.sort(nums);

        for(int i = 1; i < nums.length; i++) {

            // 3, 4 are consecutive sequence and 4 - 3 == 1.
            if(nums[i] - nums[i-1] == 1) {
                count++;
            }

            // difference between ith and (i-1)th element is not 1 AND
            // both of them are unequal, as 3 - 3 is also not equal to 1, but
            // 3, 3 is not a consecutive sequence.
            else if(nums[i] - nums[i-1] != 1 && nums[i] != nums[i-1]) {
                count = 1;
            }
            res = Math.max(res, count);
        }
        return res;
    }

    public static int longestConsecutive2(int[] nums) {
        if(nums.length == 0) return 0;

        HashSet<Integer> hs = new HashSet<>();
        for(int x : nums) {
            hs.add(x);
        }

        int res = 1;

        for(int i=0; i<nums.length; i++) {
            int count = 1;

            // if nums[i] is 3 and hs does not contain 3-1 = 2, then go to the next iteration
            // let's say 3,4 is the sequence, then hs contains 4-1=3. Thus, we can start
            // counting from 4 onwards -> that's why count is 1 above.
            if(!hs.contains(nums[i] - 1)) {

                // previous element -> nums[i] - 1 is present (checked above)
                // then see whether nums[i]+1 element is present or not and
                // increment the value of count.
                while(hs.contains(nums[i] + 1)) {
                    nums[i] = nums[i] + 1; // increment the value by 1 for each iteration.
                    count = count + 1;
                    hs.remove(nums[i]);
                }
                res = Math.max(res, count);
            }
        }
        return res;
    }
}
