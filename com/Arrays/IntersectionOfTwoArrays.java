package com.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};

        System.out.println(Arrays.toString(m1(nums1, nums2))); // [4, 9]
        System.out.println(Arrays.toString(m2(nums1, nums2))); // [4, 9]
        System.out.println(Arrays.toString(m3(nums1, nums2))); // [4, 9]
    }

    public static int[] m1(int[] nums1, int[] nums2) {
        ArrayList<Integer> al = new ArrayList<>();
        int i=0;
        int j=0;

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        while(i<nums1.length && j<nums2.length) {
            if(nums1[i] == nums2[j]) {
                al.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i] < nums2[j]) {
                i++;
            }
            else {
                j++;
            }
        }

        int[] res = new int[al.size()];
        for(int k=0; k<al.size(); k++) {
            res[k] = al.get(k);
        }
        return res;
    }

    public static int[] m2(int[] nums1, int[] nums2) {
        HashSet<Integer> h1 = new HashSet<>();
        HashSet<Integer> h2 = new HashSet<>();

        for(int i:nums1) {
            h1.add(i);
        }

        for(int i:nums2) {
            h2.add(i);
        }

        h1.retainAll(h2);

        int[] res = new int[h1.size()];
        int k=0;
        for(int x:h1) {
            res[k++] = x;
        }

        return res;
    }

    public static int[] m3(int[] nums1, int[] nums2) {
        HashSet<Integer> hs = new HashSet<>();

        Arrays.sort(nums2);

        for(int num : nums1) {
            if(binarySearch(nums2, num)) {
                hs.add(num);
            }
        }



        int[] res = new int[hs.size()];
        int i=0;
        for(int num : hs) {
            res[i] = num;
            i++;
        }

        return res;
    }

    public static boolean binarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while(start <= end) {
            int mid = start + (end - start)/2;
            if(nums[mid] == target) {
                return true;
            }
            else if(nums[mid] < target) {
                start++;
            }
            else {
                end--;
            }
        }

        return false;
    }
}
