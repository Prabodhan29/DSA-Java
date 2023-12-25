package com.String;

public class ContainsRepeatedSubstring {
    public static void main(String[] args) {
        String s = "abab";
        System.out.println(repeatedSubstringPattern(s)); // true
    }

    public static boolean repeatedSubstringPattern(String s) {
        String str = s + s;
        int str_length = str.length();

        String x = str.substring(1, str_length - 1);

        return x.contains(s);

    }
}
