package com.String;

import java.util.Stack;

public class IsSubsequence {
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahdbjsdcee";
        System.out.println(isSubsequence(s, t)); // true
        System.out.println(isSubsequence1(s, t)); // true
    }

    public static boolean isSubsequence(String s, String t) {
        Stack<Character> stack = new Stack<>();

        for(int i=s.length()-1; i>=0; i--) {
            stack.push(s.charAt(i));
        }

        for(int i=0; i<t.length(); i++) {
            if(!stack.isEmpty() && stack.peek() == t.charAt(i)) {
                stack.pop();
            }
        }
        return stack.isEmpty();
    }

    public static boolean isSubsequence1(String s, String t) {

        // because an empty string is also a valid subsequence
        if(s.length() == 0) return true;

        int s_index = 0;
        int t_index = 0;

        while(t_index < t.length()) {
            // if both characters in s and t match, increment s_index
            // and check for next index in t
            if(s.charAt(s_index) == t.charAt(t_index)) {
                s_index++;

                // we have traversed all the elements in s
                if(s_index == s.length()) return true;
            }

            // increment t_index for every single iteration
            t_index++;
        }
        return false;
    }
}
