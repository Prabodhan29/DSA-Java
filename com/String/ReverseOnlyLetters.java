package com.String;

public class ReverseOnlyLetters {
    public static void main(String[] args) {
        String s = "a-bC-dEf-ghIj";
        System.out.println(reverseOnlyLetters(s)); // j-Ih-gfE-dCba
    }
    public static String reverseOnlyLetters(String s) {
        char[] c = s.toCharArray();
        int start = 0;
        int end = c.length - 1;

        while(start < end) {
            while(start < end && !Character.isLetter(c[start])) {
                start++;
            }

            while(start < end && !Character.isLetter(c[end])) {
                end--;
            }

            swap(c, start, end);
            start++;
            end--;
        }
        return new String(c);
    }

    public static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
