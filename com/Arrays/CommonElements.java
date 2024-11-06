package com.Arrays;

import java.util.ArrayList;

public class CommonElements {
    public static void main(String[] args) {
        int[] arr1 = {1, 5, 10, 20, 40, 80};
        int[] arr2 = {6, 7, 20, 80, 100};
        int[] arr3 = {3, 4, 15, 20, 30, 70, 80, 120};
        commonElement(arr1, arr2, arr3); // [20, 80]
    }
    public static void commonElement(int[] arr1, int[] arr2, int[] arr3) {
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<arr1.length && j<arr2.length && k<arr3.length) {
            if(arr1[i] == arr2[j] && arr2[j] == arr3[k]) {
                result.add(arr1[i]);
                i++; j++; k++;
                continue;
            }
            else if(arr2[j] < arr3[k]) {
                j++;
            }
            else if(arr1[i] < arr3[k]) {
                i++;
            }
            else {
                k++;
            }
        }
        System.out.println(result);
    }
}
