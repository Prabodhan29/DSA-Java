package com.Arrays;

import java.util.Arrays;

public class NextGreaterElement {
    public static void main(String[] args) {
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        System.out.println(Arrays.toString(nextGreaterElement(nums1, nums2)));
        // [-1, 3, -1]
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res = new int[nums1.length]; // as nums1 is a subset of nums2

        for(int i = 0; i < nums1.length; i++) {

            // for every iteration we need found to be false because
            // only if found is true, we check whether there is a number greater
            // than nums1[i] and update val
            boolean found = false;

            // if we are not updating val -> found is false and no element greater than
            // nums1[i] is found.
            int val = -1;

            for(int j = 0; j < nums2.length; j++) {
                // if nums2[j] is equal to nums1[i], then make found true, and skip (continue)
                // the current iteration so that we can move forward and check whether a
                // number is greater than the current number (nums1[i]).
                if(nums2[j] == nums1[i]) {
                    found = true;
                    continue;
                }

                // if such number is found, then update val and break -> as we only need to
                // find one number which is greater than nums1[i].
                if(found && nums2[j] > nums1[i]) {
                    val = nums2[j];
                    break;
                }
            }

            // Put val in res.
            res[i] = val;
        }
        return res;
    }
}
