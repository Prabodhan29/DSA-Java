package com.BitManipulation;

public class UniqueElement {
    public static void main(String[] args) {
        int[] arr = {2, 4, 5, 4, 5, 3, 2};
        System.out.println(uniqueElement(arr)); // 3
    }

    public static int uniqueElement(int[] arr) {
        int unique = 0;
        for(int i=0; i<arr.length; i++) {
            unique = unique ^ arr[i];
        }
        return unique;
    }
}
