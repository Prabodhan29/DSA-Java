package com.Recursion;

import java.util.ArrayList;
import java.util.List;

public class PalindromePartitioning {
    public static void main(String[] args) {
        String s = "aabb";
        System.out.println(partition(s));
        // [[a, a, b, b], [a, a, bb], [aa, b, b], [aa, bb]]
    }

    public static List<List<String>> partition(String s) {
        List<List<String>> res = new ArrayList<>();
        List<String> tempAL = new ArrayList<>();
        int index = 0;

        m1(s, index, tempAL, res);

        return res;
    }

    public static void m1(String s, int index, List<String> tempAL, List<List<String>> res) {

        // base condition

        // s.length() as s is 0-indexed string -> that is, s.length() will be one more
        // than the last character of the string.
        if(index == s.length()) {
            res.add(new ArrayList<>(tempAL));
            return;
        }

        for(int i = index; i < s.length(); i++) {
            // index acts as start and i acts as end of the string
            if(isPalindrome(s, index, i)) {
                tempAL.add(s.substring(index, i+1)); // substring(start, end(exclusive))

                m1(s, i+1, tempAL, res);

                tempAL.remove(tempAL.size()-1);
            }
        }
    }

    // to check whether the string is palindrome or not
    public static boolean isPalindrome(String s, int start, int end) {
        while(start <= end) {
            if(s.charAt(start) != s.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
}
