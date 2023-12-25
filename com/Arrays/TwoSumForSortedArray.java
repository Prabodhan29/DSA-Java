package com.Arrays;

public class TwoSumForSortedArray {
    public static void main(String[] args) {
        int[] arr = {3,2,4};
        int target = 6;
        twoSum(arr, target);
    }
    public static void twoSum(int[] arr, int target){
        int start = 0;
        int end = arr.length - 1;
        int[] result = new int[2];

        while(start < end) {
            int sum = arr[start] + arr[end];
            if(sum == target) {
                result[0] = start;
                result[1] = end;
                break;
            }
            else if(sum<target) {
                start++;
            }
            else {
                end--;
            }
        }
        System.out.print(result[0]);
        System.out.print(result[1]);
    }
}
