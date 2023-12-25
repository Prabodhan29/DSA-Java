package com.Recursion;

public class isPalindrome {
    public static void main(String[] args) {
        String s = "racecar";
        String str = s.replaceAll("[^A-Za-z0-9]", "").toLowerCase();

        int start = 0;
        int end = str.length() - 1;

        System.out.println(m1(str, start, end)); // true
    }
    public static boolean m1(String s, int start, int end) {
        // base condition
        if(start >= end) return true;

        if(s.charAt(start) != s.charAt(end)) {
            return false;
        }

        return m1(s, start+1, end-1);
    }
}
