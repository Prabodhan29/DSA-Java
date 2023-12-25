package com.Arrays;

public class SwapsToReachKthNumber {
    public static void main(String[] args) {
        String num = "5489355142";
        int k = 4;
        System.out.println(getMinSwaps(num, k)); // 2
    }
    public static int getMinSwaps(String num, int k) {
        char[] array1 = num.toCharArray();
        char[] array2 = num.toCharArray();

        // to get the kth permutation
        for(int i=0; i<k; i++) {
            nextPermutation(array1);
        }

        return countSwaps(array1, array2);
    }

    // Next permutation
    public static void nextPermutation(char[] nums) {
        int index1 = -1;
        int index2 = -1;

        for(int i=nums.length-2; i>=0; i--) {
            if(nums[i] < nums[i+1]) {
                index1 = i;
                break;
            }
        }
        if(index1 == -1) {
            reverseArray(nums, 0, nums.length-1);
            return;
        }
        for(int i=nums.length-1; i>=0; i--) {
            if(nums[i] > nums[index1]) {
                index2 = i;
                break;
            }
        }
        swap(nums, index1, index2);
        reverseArray(nums, index1+1, nums.length-1);
    }

    public static void swap(char[] nums, int i, int j) {
        char temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void reverseArray(char[] nums, int start, int end) {
        while(start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    public static int countSwaps(char[] arr1, char[] arr2) {
        int i=0;
        while(arr1[i] == arr2[i]) {
            i++;
        }

        int res = 0;
        for(int k=i; k<arr2.length; k++) {
            int j = k;
            while(arr2[k] != arr1[j]) j++;

            while(k < j) {
                swap(arr1, j-1, j);
                j--;
                res++;
            }
        }
        return res;
    }
}
