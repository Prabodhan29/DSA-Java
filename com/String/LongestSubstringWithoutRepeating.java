package com.String;

import java.util.HashMap;

public class LongestSubstringWithoutRepeating {
    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s)); // 3
    }

    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        int length = 0;
        int left = 0;
        int right = 0;

        while(right < s.length()) {
            if(map.containsKey(s.charAt(right))) {
                // left stays as it is or it jumps directly one step ahead of right.
                left = Math.max(map.get(s.charAt(right)) + 1, left);
            }

            // if the entry already exists in map, then the value is updated
            // for the corresponding key.
            map.put(s.charAt(right), right);

            // length is right-left + 1 because s is O-indexed string (right-left)
            // will give us distance between right and left pointers of string.
            length = Math.max(length, right-left+1);
            right++;
        }

        return length;
    }
}
