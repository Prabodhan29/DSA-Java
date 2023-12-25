package com.BinarySearch;

public class SmallestCharGreatThanTarget {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'c';
        System.out.println(nextGreatestLetter(letters, target)); // f
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length-1;

        while(start < end) {
            int mid = start + (end-start)/2;

            // it's clear what should we do if mid is less than target
            // but even if mid is equal to target,
            // make start = mid+1
            // because we need to return a element one greater than target
            if(letters[mid] <= target) {
                start = mid + 1;
            }

            // we are not doing end = mid-1
            // because what if the mid element is the one more than target,
            // that is, it's the answer.
            // So, if we did end = mid-1 we will miss that element ->
            // as we returning and checking for start.
            else {
                end = mid;
            }
        }

        // we have to return element which is one greater than target
        if(letters[start] > target) {
            return letters[start];
        }

        // else return the first element of the array (given in the question)
        return letters[0];

    }
}
