package com.String;

import java.util.Arrays;

public class LengthOfStringAfterDeletingSimilarEnds {
    public static void main(String[] args) {
        String s = "aabccabba";
        System.out.println(minimumLength(s)); // 3
    }
    public static int minimumLength(String s) {
        int start = 0;
        int end = s.length() - 1;

        // if both first and last characters are equal
        while(start < end && s.charAt(start) == s.charAt(end)) {
            char current_char = s.charAt(start);

            // both start and current_char are equal, so increase start
            // till this condition becomes invalid.
            while(start <= end && s.charAt(start) == current_char) {
                start++;
            }

            // both end and current_char are equal, so decrease end
            // till this condition becomes invalid.
            while(start <= end && s.charAt(end) == current_char) {
                end--;
            }
        }

        // both first and last characters are not equal
        // simply return the length
        return (end - start) + 1;
    }
}
