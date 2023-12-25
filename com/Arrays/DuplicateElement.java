package com.Arrays;

import java.util.HashSet;

public class DuplicateElement {
    public static void main(String[] args) {
        int[] arr = {3,1,3,4,2};
        System.out.println(findDuplicateNumber1(arr)); // 3
        System.out.println(findDuplicateNumber2(arr)); // 3
        System.out.println(findDuplicateNumber3(arr)); // 3

    }
    public static int findDuplicateNumber1(int[] arr){
        HashSet<Integer> numbers = new HashSet<>();
        for(int x1 : arr) {
            if(!numbers.add(x1)) { // As HashSet doesn't add duplicate values
                return x1;
            }
        }
        return -1;
    }

    public static int findDuplicateNumber2(int [] arr) {
        int i = 0;
        while(i < arr.length) {
            int correct_position = arr[i] - 1;
            if(arr[i] != arr[correct_position]) {
                // swap
                int temp = arr[i];
                arr[i] = arr[correct_position];
                arr[correct_position] = temp;
            }
            else {
                i++;
            }
        }

        for(int index = 0; index < arr.length; index++) {
            if(arr[index] != index + 1) {
                return arr[index];
            }
        }
        return -1;
    }

    public static int findDuplicateNumber3(int[] arr) {
        int slow = 0;
        int fast = 0;

        slow = arr[slow];
        fast = arr[arr[fast]];

        while(slow != fast) {
            slow = arr[slow];
            fast = arr[arr[fast]];
        }

        slow = 0;
        while(slow != fast) {
            slow = arr[slow];
            fast = arr[fast];
        }
        return slow;
    }
}
