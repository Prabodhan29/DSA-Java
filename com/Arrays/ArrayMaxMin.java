package com.Arrays;

import java.util.Arrays;

public class ArrayMaxMin {
    public static void main(String[] pro) {
        int[] arr = {54446, 2, 3, 45, 5444};
        maxmin(arr);
        maxminWithSortMethod(arr);
    }

    public static void maxmin (int[] arr) {
        int max = arr[0];
        int min = arr[0];
        for(int i=0; i<=arr.length-1; i++) {
            if(max<arr[i]){
                max=arr[i];
            }
            if(min>arr[i]) {
                min=arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    }

    public static void maxminWithSortMethod(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        System.out.println("Max element is: " + arr[n-1]);
        System.out.println("Min element is: " + arr[0]);
    }
}
