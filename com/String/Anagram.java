package com.String;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram2(s, t)); // true
        System.out.println(isAnagram1(s, t)); // true
    }

    public static boolean isAnagram2(String s, String t) {
        if(s.length() != t.length()) return false;

        char[] c1 = s.toCharArray();
        char[] c2 = t.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);

        return Arrays.equals(c1, c2);
    }

    public static boolean isAnagram1(String s, String t) {
        // if both strings are of different length -> return false
        if(s.length() != t.length()) return false;

        int[] nums = new int[26];

        // to store all the characters in s at their respective indexes
        // eg. a will be stored at 0 (the value would be 1 as we incrementing by 1)
        // Eg. "abcd" will be [1,1,1,1,0,0,0,0,...,0]
        for(int i=0; i<s.length(); i++) {
            nums[s.charAt(i) - 'a']++;
        }

        // then the stored values will be removed
        for(int i=0; i<t.length(); i++) {
            nums[t.charAt(i) - 'a']--;
        }

        // after removing values from nums[]. If s, t are anagrams, then nums[] would
        // have all elements as 0. If not, they are not anagrams.
        for(int num : nums) {
            if(num != 0) return false;
        }
        return true;
    }
}

