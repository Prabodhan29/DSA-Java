package com.Arrays;

public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 4, 8, 19, 10, 16};
        secondLargestElement(arr); // The second largest element is 16
    }

    public static void secondLargestElement(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int second_largest = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++) {
            if(arr[i] > largest) {
                second_largest = largest;
                largest = arr[i];
            }
            else if(arr[i] < largest && arr[i] > second_largest) {
                second_largest = arr[i];
            }
        }
        System.out.println("The second largest element is " + second_largest);
    }
}
