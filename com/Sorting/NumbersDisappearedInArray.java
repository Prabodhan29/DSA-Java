package com.Sorting;

import java.util.ArrayList;
import java.util.List;

public class NumbersDisappearedInArray {
    public static void main(String[] args) {
        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDisappearedNumbers(nums)); // [5, 6]
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        // sorting
        int i=0;
        while(i<nums.length) {
            int correct = nums[i] - 1;
            if(nums[i] != nums[correct]) {
                swap(nums, i, correct);
            }
            else {
                i++;
            }
        }

        // searching for element
        List<Integer> al = new ArrayList<>();
        for(int index = 0; index < nums.length; index++) {
            if(nums[index] != index + 1) {
                al.add(index + 1);
            }
        }
        return al;
    }

    private static void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
}
