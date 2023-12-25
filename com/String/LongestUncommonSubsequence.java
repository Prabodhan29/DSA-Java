package com.String;

public class LongestUncommonSubsequence {
    public static void main(String[] args) {
        String a = "aaa";
        String b = "bbba";
        System.out.println(findLUSlength(a, b)); // 4
    }

    public static int findLUSlength(String a, String b) {
        if(a.equals(b)) {
            return -1;
        }
        return Math.max(a.length(), b.length());
    }
}
